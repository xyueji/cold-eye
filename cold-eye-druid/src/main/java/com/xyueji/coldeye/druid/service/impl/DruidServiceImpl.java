package com.xyueji.coldeye.druid.service.impl;

import com.xyueji.coldeye.druid.common.DruidHelper;
import com.xyueji.coldeye.druid.common.MessageEntity;
import com.xyueji.coldeye.druid.common.ResultResp;
import com.xyueji.coldeye.druid.service.DruidService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * @author xiongzhigang
 * @date 2021-02-01 14:52
 * @description
 */
@Service("druidService")
public class DruidServiceImpl implements DruidService {
    /**
     * 查询druid数据列表
     *
     * @param params 查询参数
     * @return ResultResp
     */
    @Override
    public ResultResp queryDruidList(Map<String, Object> params) {
        //根据参数组装查询条件
        String sql = querySQL(params);

        // 实例化Druid JDBC连接
        DruidHelper helper = new DruidHelper();
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            List<MessageEntity> resultList = new ArrayList<>();
            connection = helper.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                MessageEntity messageEntity = rs2Entity(rs);

                resultList.add(messageEntity);
            }

            //设置返回格式
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("items", resultList);

            return ResultResp.ok(map);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            helper.close(connection, st, rs);
        }

        return ResultResp.error();
    }

    /**
     * 查询设备温度湿度
     *
     * @param params 查询参数
     * @return ResultResp
     */
    @Override
    public ResultResp queryDruidTumHum(Map<String, Object> params) {
        //查询druid数据列表
        List<MessageEntity> list = (List<MessageEntity>)queryDruidList(params).get("items");

        List<String> times = new ArrayList<>();
        List<Integer> tems = new ArrayList<>();
        List<Integer> hums = new ArrayList<>();

        //给数组赋值
        for (int i = 0; i < list.size(); i++) {
            MessageEntity messageHistoryEntity = (MessageEntity) list.get(i);

            String strTime = messageHistoryEntity.getCurtime();

            times.add(strTime.substring(8, 10) + ":" + strTime.substring(10, 12)+ ":" + strTime.substring(12, 14));
            tems.add(messageHistoryEntity.getTem());
            hums.add(messageHistoryEntity.getHum());
        }

        //按时间重新排序
        Collections.reverse(times);
        Collections.reverse(tems);
        Collections.reverse(hums);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("xAxis", times);
        map.put("tem", tems);
        map.put("hum", hums);
        return ResultResp.ok(map);
    }

    /**
     * 查询条件
     * @param params
     * @return
     */
    private String querySQL(Map<String, Object> params){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SELECT * from all_device_message where 1= 1 ");

        //设备编码
        String  metercode = params.get("meterCode").toString().trim();
        if(!metercode.equals("")){
            stringBuffer.append(" and meterCode = '");
            stringBuffer.append(metercode);
            stringBuffer.append("' ");
        }

        //前台传入开始、结束时间
        String startTime = params.get("startTime").toString().trim();
        if(!startTime.equals("")){
            stringBuffer.append(" and __time > '");
            stringBuffer.append(startTime);
            stringBuffer.append("' ");
        }
        String endTime = params.get("endTime").toString().trim();
        if(!endTime.equals("")){
            stringBuffer.append(" and __time < '");
            stringBuffer.append(endTime);
            stringBuffer.append("' ");
        }

        stringBuffer.append(" order by __time desc");

        //查询条数
        String limit = params.get("limit")!=null? params.get("limit").toString().trim():"10";
        stringBuffer.append(" limit ");
        stringBuffer.append(limit);

        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    /**
     * 查询结果转化为对象
     * @param rs
     * @return
     * @throws Exception
     */
    private MessageEntity rs2Entity(ResultSet rs) throws Exception{
        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setMeterCode(rs.getString("meterCode"));
        messageEntity.setMeterId(rs.getString("meterId"));
        messageEntity.setMeterName(rs.getString("meterName"));
        messageEntity.setHostCode(rs.getString("hostCode"));
        messageEntity.setHostId(rs.getString("hostId"));
        messageEntity.setHostName(rs.getString("hostName"));
        messageEntity.setHouseCode(rs.getString("houseCode"));
        messageEntity.setHouseId(rs.getString("houseId"));
        messageEntity.setHouseName(rs.getString("houseName"));
        messageEntity.setCompanyName(rs.getString("companyName"));
        messageEntity.setCompanyId(rs.getString("companyId"));
        messageEntity.setTem(Integer.valueOf(rs.getString("tem")));
        messageEntity.setMaxTem(Integer.valueOf(rs.getString("maxTem")));
        messageEntity.setMinTem(Integer.valueOf(rs.getString("minTem")));
        messageEntity.setHum(Integer.valueOf(rs.getString("hum")));
        messageEntity.setMaxHum(Integer.valueOf(rs.getString("maxHum")));
        messageEntity.setMinHum(Integer.valueOf(rs.getString("minHum")));
        messageEntity.setTemAlert(Integer.valueOf(rs.getString("temAlert")));
        messageEntity.setHumAlert(Integer.valueOf(rs.getString("humAlert")));
        messageEntity.setState(Integer.valueOf(rs.getString("state")));
        messageEntity.setLat(rs.getString("lat"));
        messageEntity.setLon(rs.getString("lon"));
        messageEntity.setCurtime(rs.getString("curtime"));

        return messageEntity;
    }
}

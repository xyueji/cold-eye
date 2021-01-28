package com.xyueji.coldeye.admin.controller;

import com.xyueji.coldeye.admin.service.MeterService;
import com.xyueji.coldeye.common.utils.JedisUtil;
import com.xyueji.coldeye.common.admin.entity.MeterEntity;
import com.xyueji.coldeye.common.utils.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 15:54
 * @description
 */
@RestController
@RequestMapping("admin/meter")
public class MeterController {
    @Resource
    private MeterService meterService;

    /**
    * @api {GET} admin/meter/list 仪器列表
    * @apiDescription 仪器列表
    * @apiGroup MeterController
    * @apiParam {Integer} page 当前页
    * @apiParam {Integer} pagesize 页大小
    * @apiParam {String} hostId 主机ID
    * @apiParam {String} companyName 公司名称
    * @apiParam {String} houseName 库房名称
    * @apiParam {String} hostName 主机名称
    * @apiParam {String} meterCode 仪器ID
    * @apiParam {String} meterName 仪器名称
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "page": 1,
    *   "pagesize": 10,
    *   "hostId": "xxx",
    *   "companyName: "xxx",
    *   "houseName: "xxx",
    *   "hostName: "xxx",
    *   "meterCode: "xxx",
    *   "meterName: "xxx"
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "code":"0",
    *   "msg":"success",
    *   "data":{
    *
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("list")
    public ResultResp list(@RequestParam Map<String, Object> params) {
        PageUtils res = meterService.queryPage(params);
        return ResultResp.ok(res.getPageMap());
    }

    /**
    * @api {GET} admin/meter/info/{id} 根据ID获取仪器信息
    * @apiDescription 根据ID获取仪器信息
    * @apiGroup MeterController
    * @apiParam {Long} id 仪器ID
    *
    * @apiParamExample {json} 请求示例:
    * {
    *
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "code":"0",
    *   "msg":"success",
    *   "data":{
    *
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("info/{id}")
    public ResultResp info(@PathVariable("id") String id) {
        MeterEntity meterEntity = meterService.getById(id);
        return ResultResp.ok().put("meter", meterEntity);
    }

    /**
    * @api {GET} admin/meter/save 新增仪器信息
    * @apiDescription 新增仪器信息
    * @apiGroup MeterController
    * @apiParam {String} meterCode     设备编码
    * @apiParam {String} meterName     设备名称
    * @apiParam {String} hostId        主机ID
    * @apiParam {String} hostCode      主机编码
    * @apiParam {String} hostName      主机名称
    * @apiParam {String} houseId       仓库Id
    * @apiParam {String} houseCode     仓库编码
    * @apiParam {String} houseName     仓库名称
    * @apiParam {String} companyId     公司Id
    * @apiParam {String} companyName   公司名称
    * @apiParam {String} meterStatus   仪表状态(1-在用,0-停用,2-异常)
    * @apiParam {String} maxTem        温度上限
    * @apiParam {String} minTem        温度下限
    * @apiParam {String} maxHum        湿度上限
    * @apiParam {String} minHum        湿度下限
    * @apiParam {String} meterInterval 采集间隔
    * @apiParam {String} remarks       备注信息
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "meterCode": "xxx",
    *   "meterName": "xxx",
    *   "hostId": "xxx",
    *   "hostCode": "xxx",
    *   "hostName": "xxx",
    *   "houseId": "xxx",
    *   "houseCode": "xxx",21",
    *   "houseName": "xxx",
    *   "companyId": "xxx",
    *   "companyName": "xxx",
    *   "meterStatus": "xxx",
    *   "maxTem": "xxx",
    *    "minTem       ": "xxx",
    *   "maxHum       ": "xxx",
    *   "minHum       ": "xxx",
    *   "meterInterval": "xxx",
    *   "remarks      ": "xxx"
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "code":"0",
    *   "msg":"success",
    *   "data":{
    *
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("save")
    public ResultResp save(@RequestBody MeterEntity meterEntity) {
        meterEntity.setId(MD5Util.enCodeByMd5(meterEntity.toString()));
        meterService.save(meterEntity);

        JedisUtil.Strings strings = JedisUtil.getInstance().new Strings();
        strings.set(meterEntity.getMeterCode(), SerializeUtil.serialize(meterEntity));
        return ResultResp.ok();
    }

    /**
     * @api {GET} admin/meter/update 更新仪器信息
     * @apiDescription 更新仪器信息
     * @apiGroup MeterController
     * @apiParam {String} meterCode     设备编码
     * @apiParam {String} meterName     设备名称
     * @apiParam {String} hostId        主机ID
     * @apiParam {String} hostCode      主机编码
     * @apiParam {String} hostName      主机名称
     * @apiParam {String} houseId       仓库Id
     * @apiParam {String} houseCode     仓库编码
     * @apiParam {String} houseName     仓库名称
     * @apiParam {String} companyId     公司Id
     * @apiParam {String} companyName   公司名称
     * @apiParam {String} meterStatus   仪表状态(1-在用,0-停用,2-异常)
     * @apiParam {String} maxTem        温度上限
     * @apiParam {String} minTem        温度下限
     * @apiParam {String} maxHum        湿度上限
     * @apiParam {String} minHum        湿度下限
     * @apiParam {String} meterInterval 采集间隔
     * @apiParam {String} remarks       备注信息
     *
     * @apiParamExample {json} 请求示例:
     * {
     *   "meterCode": "xxx",
     *   "meterName": "xxx",
     *   "hostId": "xxx",
     *   "hostCode": "xxx",
     *   "hostName": "xxx",
     *   "houseId": "xxx",
     *   "houseCode": "xxx",21",
     *   "houseName": "xxx",
     *   "companyId": "xxx",
     *   "companyName": "xxx",
     *   "meterStatus": "xxx",
     *   "maxTem": "xxx",
     *   "minTem       ": "xxx",
     *   "maxHum       ": "xxx",
     *   "minHum       ": "xxx",
     *   "meterInterval": "xxx",
     *   "remarks      ": "xxx"
     * }
     * @apiSuccessExample {json} 成功响应:
     * HTTP/1.1 200 OK
     * {
     *   "code":"0",
     *   "msg":"success",
     *   "data":{
     *
     *   }
     * }
     * @apiVersion 1.0.0
     */
    @RequestMapping("update")
    public ResultResp update(@RequestBody MeterEntity meterEntity) {
        meterService.updateById(meterEntity);

        JedisUtil.Strings strings = JedisUtil.getInstance().new Strings();
        strings.set(meterEntity.getMeterCode(), SerializeUtil.serialize(meterEntity));
        return ResultResp.ok();
    }

    /**
    * @api {GET} admin/meter/delete 删除仪器信息
    * @apiDescription 删除仪器信息
    * @apiGroup MeterController
    * @apiParam {String} id 仪器ID
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "id": "xxx"
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "code":"0",
    *   "msg":"success",
    *   "data":{
    *
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("delete")
    public ResultResp delete(String id) {
        meterService.removeById(id);

        JedisUtil.getInstance().getJedis().del(meterService.getById(id).getMeterCode());
        return ResultResp.ok();
    }
}

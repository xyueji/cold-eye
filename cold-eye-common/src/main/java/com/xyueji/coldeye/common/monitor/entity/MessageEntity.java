package com.xyueji.coldeye.common.monitor.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xyueji.coldeye.common.constant.TConstants;

import java.io.Serializable;

@TableName(TConstants.T_MESSAGE_REALTIME)
public class MessageEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *  设备编码
     */
    private String meterCode;

    /**
     * 设备主键
     */
    private String meterId;

    /**
     * 设备名称
     */
    private String meterName;
    /**
     * 主机Id
     */
    private String hostId;
    /**
     * 主机编码
     */
    private String hostCode;
    /**
     * 主机名称
     */
    private String hostName;
    /**
     * 仓库id
     */
    private String houseId;
    /**
     * 仓库编码
     */
    private String houseCode;
    /**
     * 仓库名称
     */
    private String houseName;
    /**
     * 公司id
     */
    private String companyId;
    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 温度
     */
    private int tem;

    /**
     * 温度上限
     */
    private int maxTem;

    /**
     * 温度下限
     *
     */
    private int minTem;

    /**
     * 湿度
     */
    private int hum;

    /**
     * 湿度上限
     */
    private int maxHum;

    /**
     * 湿度下限
     */
    private int minHum;

    /**
     * 温度状况： 1：高温， 0： 正常， -1： 低温
     */
    private int temAlert;

    /**
     * 湿度状况： 1：高湿， 0： 正常， -1： 低湿
     */
    private int humAlert;

    /**
     * 状态: 1-在用，0-停用，2-异常
     */
    private int state;

    /**
     * 经度
     */
    private String lon;

    /**
     * 维度
     */
    private String lat;

    /**
     * 当前时间
     */
    private String curtime;

    /**
     * 测试报文
     * @return
     */
    public String deviceMessage(){
        StringBuffer sb = new StringBuffer();
        sb.append("SHT");
        sb.append("|").append(this.getMeterCode());
        sb.append("|").append(this.getTem());
        sb.append("|").append(this.getHum());
        sb.append("|").append(this.getState());
        sb.append("|").append(this.getLon());
        sb.append("|").append(this.getLat());
        sb.append("|").append(this.getCurtime());
        sb.append("|").append("SH5lb1.2.1R");
        return sb.toString();
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostCode() {
        return hostCode;
    }

    public void setHostCode(String hostCode) {
        this.hostCode = hostCode;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTem() {
        return tem;
    }

    public void setTem(int tem) {
        this.tem = tem;
    }

    public int getMaxTem() {
        return maxTem;
    }

    public void setMaxTem(int maxTem) {
        this.maxTem = maxTem;
    }

    public int getMinTem() {
        return minTem;
    }

    public void setMinTem(int minTem) {
        this.minTem = minTem;
    }

    public int getHum() {
        return hum;
    }

    public void setHum(int hum) {
        this.hum = hum;
    }

    public int getMaxHum() {
        return maxHum;
    }

    public void setMaxHum(int maxHum) {
        this.maxHum = maxHum;
    }

    public int getMinHum() {
        return minHum;
    }

    public void setMinHum(int minHum) {
        this.minHum = minHum;
    }

    public int getTemAlert() {
        return temAlert;
    }

    public void setTemAlert(int temAlert) {
        this.temAlert = temAlert;
    }

    public int getHumAlert() {
        return humAlert;
    }

    public void setHumAlert(int humAlert) {
        this.humAlert = humAlert;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getCurtime() {
        return curtime;
    }

    public void setCurtime(String curtime) {
        this.curtime = curtime;
    }
}

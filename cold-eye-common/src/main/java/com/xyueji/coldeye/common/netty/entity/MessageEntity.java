package com.xyueji.coldeye.common.netty.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xyueji.coldeye.common.constant.TConstants;
import lombok.Data;

import java.io.Serializable;

@TableName(TConstants.T_MESSAGE_REALTIME)
public class MessageEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *  设备编码
     */
    private String metercode;

    /**
     * 设备主键
     */
    private String meterid;

    /**
     * 设备名称
     */
    private String metername;
    /**
     * 主机Id
     */
    private String hostid;
    /**
     * 主机编码
     */
    private String hostcode;
    /**
     * 主机名称
     */
    private String hostname;
    /**
     * 仓库id
     */
    private String houseid;
    /**
     * 仓库编码
     */
    private String housecode;
    /**
     * 仓库名称
     */
    private String housename;
    /**
     * 公司id
     */
    private String companyid;
    /**
     * 公司名称
     */
    private String companyname;

    /**
     * 温度
     */
    private int tem;

    /**
     * 温度上限
     */
    private int maxtem;

    /**
     * 温度下限
     *
     */
    private int mintem;

    /**
     * 湿度
     */
    private int hum;

    /**
     * 湿度上限
     */
    private int maxhum;

    /**
     * 湿度下限
     */
    private int minhum;

    /**
     * 温度状况： 1：高温， 0： 正常， -1： 低温
     */
    private int temalert;

    /**
     * 湿度状况： 1：高湿， 0： 正常， -1： 低湿
     */
    private int humalert;

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
        sb.append("|").append(this.getMetercode());
        sb.append("|").append(this.getTem());
        sb.append("|").append(this.getHum());
        sb.append("|").append(this.getState());
        sb.append("|").append(this.getLon());
        sb.append("|").append(this.getLat());
        sb.append("|").append(this.getCurtime());
        sb.append("|").append("SH5lb1.2.1R");
        return sb.toString();
    }

    public String getMetercode() {
        return metercode;
    }

    public void setMetercode(String metercode) {
        this.metercode = metercode;
    }

    public String getMeterid() {
        return meterid;
    }

    public void setMeterid(String meterid) {
        this.meterid = meterid;
    }

    public String getMetername() {
        return metername;
    }

    public void setMetername(String metername) {
        this.metername = metername;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getHostcode() {
        return hostcode;
    }

    public void setHostcode(String hostcode) {
        this.hostcode = hostcode;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getHousecode() {
        return housecode;
    }

    public void setHousecode(String housecode) {
        this.housecode = housecode;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getTem() {
        return tem;
    }

    public void setTem(int tem) {
        this.tem = tem;
    }

    public int getMaxtem() {
        return maxtem;
    }

    public void setMaxtem(int maxtem) {
        this.maxtem = maxtem;
    }

    public int getMintem() {
        return mintem;
    }

    public void setMintem(int mintem) {
        this.mintem = mintem;
    }

    public int getHum() {
        return hum;
    }

    public void setHum(int hum) {
        this.hum = hum;
    }

    public int getMaxhum() {
        return maxhum;
    }

    public void setMaxhum(int maxhum) {
        this.maxhum = maxhum;
    }

    public int getMinhum() {
        return minhum;
    }

    public void setMinhum(int minhum) {
        this.minhum = minhum;
    }

    public int getTemalert() {
        return temalert;
    }

    public void setTemalert(int temalert) {
        this.temalert = temalert;
    }

    public int getHumalert() {
        return humalert;
    }

    public void setHumalert(int humalert) {
        this.humalert = humalert;
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

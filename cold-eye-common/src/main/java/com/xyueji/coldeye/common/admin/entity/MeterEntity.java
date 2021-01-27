package com.xyueji.coldeye.common.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xyueji.coldeye.common.constant.TConstants;

import java.util.Date;

/**
 * @author xiongzhigang
 * @date 2021-01-27 14:36
 * @description
 */
@TableName(TConstants.T_METER)
public class MeterEntity {
    @TableId
    private String id;
    private String meterCode;
    private String meterName;
    private String hostId;
    private String hostCode;
    private String hostName;
    private String houseId;
    private String houseCode;
    private String houseName;
    private String companyId;
    private String companyName;
    private int meterStatus;
    private int maxTem;
    private int minTem;
    private int maxHum;
    private int minHum;
    private int meterInterval;
    private String remarks;
    private Date createdTime;
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MeterEntity{" +
                "id='" + id + '\'' +
                ", meterCode='" + meterCode + '\'' +
                ", meterName='" + meterName + '\'' +
                ", hostId='" + hostId + '\'' +
                ", hostCode='" + hostCode + '\'' +
                ", hostName='" + hostName + '\'' +
                ", houseId='" + houseId + '\'' +
                ", houseCode='" + houseCode + '\'' +
                ", houseName='" + houseName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", meterStatus=" + meterStatus +
                ", maxTem=" + maxTem +
                ", minTem=" + minTem +
                ", maxHum=" + maxHum +
                ", minHum=" + minHum +
                ", meterInterval=" + meterInterval +
                ", remarks='" + remarks + '\'' +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
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

    public int getMeterStatus() {
        return meterStatus;
    }

    public void setMeterStatus(int meterStatus) {
        this.meterStatus = meterStatus;
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

    public int getMeterInterval() {
        return meterInterval;
    }

    public void setMeterInterval(int meterInterval) {
        this.meterInterval = meterInterval;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

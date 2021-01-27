package com.xyueji.coldeye.common.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xyueji.coldeye.common.constant.TConstants;

import java.util.Date;

/**
 * @author xiongzhigang
 * @date 2021-01-27 14:34
 * @description
 */
@TableName(TConstants.T_HOST)
public class HostEntity {
    @TableId
    private String id;
    private String hostCode;
    private String hostName;
    private String houseId;
    private String houseCode;
    private String houseName;
    private int hostStatus;
    private String hostModel;
    private String simCode;
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
        return "HostEntity{" +
                "id='" + id + '\'' +
                ", hostCode='" + hostCode + '\'' +
                ", hostName='" + hostName + '\'' +
                ", houseId='" + houseId + '\'' +
                ", houseCode='" + houseCode + '\'' +
                ", houseName='" + houseName + '\'' +
                ", hostStatus=" + hostStatus +
                ", hostModel='" + hostModel + '\'' +
                ", simCode='" + simCode + '\'' +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                '}';
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

    public int getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(int hostStatus) {
        this.hostStatus = hostStatus;
    }

    public String getHostModel() {
        return hostModel;
    }

    public void setHostModel(String hostModel) {
        this.hostModel = hostModel;
    }

    public String getSimCode() {
        return simCode;
    }

    public void setSimCode(String simCode) {
        this.simCode = simCode;
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

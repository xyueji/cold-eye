package com.xyueji.coldeye.common.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xyueji.coldeye.common.constant.TConstants;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongzhigang
 * @date 2021-01-27 14:22
 * @description
 */
@TableName(TConstants.T_WAREHOUSE)
public class WareHouseEntity {
    @TableId
    private String id;
    private String houseCode;
    private String houseName;
    private String houseAddress;
    private int houseType;
    private String companyId;
    private String companyName;
    private String principalName;
    private String principalTel;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private double areaSize;
    private int houseStatus;
    private Date createdTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "WareHouseEntity{" +
                "id='" + id + '\'' +
                ", houseCode='" + houseCode + '\'' +
                ", houseName='" + houseName + '\'' +
                ", houseAddress='" + houseAddress + '\'' +
                ", houseType=" + houseType +
                ", companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", principalName='" + principalName + '\'' +
                ", principalTel='" + principalTel + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", areaSize=" + areaSize +
                ", houseStatus=" + houseStatus +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public int getHouseType() {
        return houseType;
    }

    public void setHouseType(int houseType) {
        this.houseType = houseType;
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

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getPrincipalTel() {
        return principalTel;
    }

    public void setPrincipalTel(String principalTel) {
        this.principalTel = principalTel;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public int getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(int houseStatus) {
        this.houseStatus = houseStatus;
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

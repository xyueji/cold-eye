package com.xyueji.coldeye.common.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xyueji.coldeye.common.constant.TConstants;

import java.util.Date;

/**
 * @author xiongzhigang
 * @date 2021-01-27 14:14
 * @description
 */
@TableName(TConstants.T_COMPANY)
public class CompanyEntity {
    @TableId
    private String id;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 公司简称
     *
     */
    private String abbreviation;

    /**
     * 企业编号
     *
     */
    private String companyNumber;

    /**
     * 企业地址
     *
     */
    private String companyAddress;

    /**
     * 公司电话
     *
     */
    private String companyPhone;

    /**
     * 质量管理员
     *
     */
    private String managementName;

    /**
     * 联系电话
     *
     */
    private String managementPhone;

    /**
     * 负责人姓名
     *
     */
    private String leader;

    /**
     * 负责人电话
     *
     */
    private String leaderPhone;

    /**
     * 备注
     *
     */
    private String message;

    /**
     * 网站
     *
     */
    private String webAddress;

    /**
     * 企业类型
     *
     */
    private String companyType;

    /**
     * 创建时间
     *
     */
    private Date createdTime;

    /**
     * 修改时间
     *
     */
    private Date updateTime;

    @Override
    public String toString() {
        return "CompanyEntity{" +
                "id='" + id + '\'' +
                ", company='" + company + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", companyNumber='" + companyNumber + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", managementName='" + managementName + '\'' +
                ", managementPhone='" + managementPhone + '\'' +
                ", leader='" + leader + '\'' +
                ", leaderPhone='" + leaderPhone + '\'' +
                ", message='" + message + '\'' +
                ", webAddress='" + webAddress + '\'' +
                ", companyType='" + companyType + '\'' +
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getManagementName() {
        return managementName;
    }

    public void setManagementName(String managementName) {
        this.managementName = managementName;
    }

    public String getManagementPhone() {
        return managementPhone;
    }

    public void setManagementPhone(String managementPhone) {
        this.managementPhone = managementPhone;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
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

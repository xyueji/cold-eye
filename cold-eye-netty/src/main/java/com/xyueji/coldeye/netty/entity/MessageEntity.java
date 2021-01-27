package com.xyueji.coldeye.netty.entity;

import lombok.Data;

import java.io.Serializable;

@Data
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
}

package com.xyueji.coldeye.common.utils;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-01 16:05
 * @description
 */
public class ResultResp {
    private static final int OK_STATUS = 200;
    private static final int ERR_STATUS = 500;
    private static final int NO_LOGIN_STATUS = 3;
    public static final ResultResp SUCCESSED = new ResultResp(OK_STATUS, "SUCCESS");
    public static final ResultResp FAILED = new ResultResp(ERR_STATUS, "FAIL");
    public static final ResultResp NO_LOGIN = new ResultResp(NO_LOGIN_STATUS,"请先登录");

    private Integer status;
    private String message;
    private Object data;

    public ResultResp(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    /**
     * 只提示用户信息，无data
     * @param status
     * @param message
     */
    public ResultResp(Integer status, String  message) {
        this.status = status;
        this.message = message;
    }
    public ResultResp() {
    }

    public static ResultResp failed(String errMsg) {
        return new ResultResp(ERR_STATUS, errMsg);
    }


    /**
     * 提示alarm
     * @param alarmMsg
     * @param alarmCode
     * @return
     */
    public static ResultResp alarm(String alarmMsg,int alarmCode) {
        return new ResultResp(alarmCode, alarmMsg);
    }

    public static ResultResp success(Object data) {
        return new ResultResp(OK_STATUS, data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

package com.xyueji.coldeye.common.utils;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-01 16:05
 * @description
 */
public class ResultResp extends HashMap<String, Object> {
    public ResultResp() {
        put("code", 0);
        put("msg", "success");
    }

    @Override
    public ResultResp put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public static ResultResp error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static ResultResp error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static ResultResp ok() {
        return new ResultResp();
    }

    public static ResultResp ok(String msg) {
        ResultResp resultResp = new ResultResp();
        resultResp.put("msg", msg);

        return resultResp;
    }

    public static ResultResp ok(Map<String, Object> map) {
        ResultResp resultResp = new ResultResp();
        resultResp.putAll(map);

        return resultResp;
    }

    public static ResultResp error(int code, String msg) {
        ResultResp resultResp = new ResultResp();
        resultResp.put("code", code);
        resultResp.put("msg", msg);

        return resultResp;
    }
}

package com.xyueji.coldeye.druid.service;


import com.xyueji.coldeye.druid.common.ResultResp;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-02-01 14:49
 * @description
 */
public interface DruidService {
    /**
     * 查询druid数据列表
     *
     * @param params 查询参数
     * @return ResultResp
     */
    ResultResp queryDruidList(Map<String, Object> params);

    /**
     * 查询设备温度湿度
     *
     * @param params 查询参数
     * @return ResultResp
     */
    ResultResp queryDruidTumHum(Map<String, Object> params);
}

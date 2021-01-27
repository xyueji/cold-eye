package com.xyueji.coldeye.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.admin.entity.MeterEntity;
import com.xyueji.coldeye.common.utils.PageUtils;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 15:10
 * @description
 */
public interface MeterService extends IService<MeterEntity> {
    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return PageUtils
     */
    PageUtils queryPage(Map<String, Object> params);
}

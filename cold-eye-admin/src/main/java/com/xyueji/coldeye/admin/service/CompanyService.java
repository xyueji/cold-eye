package com.xyueji.coldeye.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.admin.entity.CompanyEntity;
import com.xyueji.coldeye.common.utils.PageUtils;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 14:57
 * @description
 */
public interface CompanyService extends IService<CompanyEntity> {
    /**
     * 分页查询
     *
     * @param params 参数
     * @return PageUtils
     */
    public PageUtils queryPage(Map<String, Object> params);
}

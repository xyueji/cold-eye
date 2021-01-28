package com.xyueji.coldeye.monitor.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.monitor.entity.MessageEntity;
import com.xyueji.coldeye.common.utils.PageUtils;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-28 15:26
 * @description
 */
public interface MessageService extends IService<MessageEntity> {
    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return PageUtils
     */
    PageUtils queryPage(Map<String, Object> params);
}

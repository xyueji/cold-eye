package com.xyueji.coldeye.common.monitor.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyueji.coldeye.common.monitor.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiongzhigang
 * @date 2021-01-27 19:34
 * @description
 */
@Mapper
public interface MessageDao extends BaseMapper<MessageEntity> {
}

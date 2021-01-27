package com.xyueji.coldeye.common.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyueji.coldeye.common.job.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-26 11:17
 * @description
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {
    /**
     * 批量更新
     *
     * @param map
     */
    public void updateBatch(Map<String, Object> map);
}

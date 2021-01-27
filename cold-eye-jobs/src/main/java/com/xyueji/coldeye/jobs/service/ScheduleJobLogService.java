package com.xyueji.coldeye.jobs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.job.entity.ScheduleJobLogEntity;
import com.xyueji.coldeye.common.utils.PageUtils;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-26 14:58
 * @description 定时任务日志
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {
    /**
     * 分页查询
     *
     * @param params
     * @return
     */
    public PageUtils queryPage(Map<String, Object> params);
}

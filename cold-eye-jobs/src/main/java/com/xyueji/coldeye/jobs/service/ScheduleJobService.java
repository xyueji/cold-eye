package com.xyueji.coldeye.jobs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyueji.coldeye.common.job.entity.ScheduleJobEntity;
import com.xyueji.coldeye.common.utils.PageUtils;

import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-26 14:57
 * @description 定时任务
 */
public interface ScheduleJobService extends IService<ScheduleJobEntity> {
    /**
     * 分页查询
     *
     * @param params
     * @return
     */
    public PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存定时任务
     *
     * @param scheduleJob
     */
    public void saveJob(ScheduleJobEntity scheduleJob);

    /**
     * 更新定时任务
     *
     * @param scheduleJob
     */
    public void update(ScheduleJobEntity scheduleJob);

    /**
     * 批量删除定时任务
     *
     * @param jobIds
     */
    public void deleteBatch(Long[] jobIds);

    /**
     * 批量更新定时任务
     *
     * @param jobIds
     * @param status
     */
    public void updateBatch(Long[] jobIds, int status);

    /**
     * 立即执行
     *
     * @param jobIds
     */
    public void run(Long[] jobIds);

    /**
     * 暂停执行
     *
     * @param jobIds
     */
    public void pause(Long[] jobIds);

    /**
     * 恢复执行
     *
     * @param jobIds
     */
    public void resume(Long[] jobIds);
}

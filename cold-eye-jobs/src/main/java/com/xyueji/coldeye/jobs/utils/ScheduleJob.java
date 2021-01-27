package com.xyueji.coldeye.jobs.utils;

import com.xyueji.coldeye.common.job.entity.ScheduleJobEntity;
import com.xyueji.coldeye.common.job.entity.ScheduleJobLogEntity;
import com.xyueji.coldeye.common.utils.SpringContextUtils;
import com.xyueji.coldeye.jobs.service.ScheduleJobLogService;
import org.apache.commons.lang.StringUtils;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @author xiongzhigang
 * @date 2021-01-26 14:46
 * @description 定时任务
 */
public class ScheduleJob extends QuartzJobBean {
    private final static Logger log = LoggerFactory.getLogger(ScheduleJob.class);

    @Override
    protected void executeInternal(JobExecutionContext context) {
        ScheduleJobEntity scheduleJobEntity = (ScheduleJobEntity) context.getMergedJobDataMap().get(ScheduleJobEntity.JOB_PARAM_KEY);

        ScheduleJobLogService scheduleJobLogService = (ScheduleJobLogService) SpringContextUtils.getBean("scheduleJobLogService");

        ScheduleJobLogEntity scheduleJobLogEntity = new ScheduleJobLogEntity();
        scheduleJobLogEntity.setBeanName(scheduleJobEntity.getBeanName());
        scheduleJobLogEntity.setJobId(scheduleJobEntity.getJobId());
        scheduleJobLogEntity.setParams(scheduleJobEntity.getParams());
        scheduleJobLogEntity.setCreateTime(new Date());

        // 执行任务
        long startTime = System.currentTimeMillis();

        try {
            log.info("任务开始执行，任务ID: {}", scheduleJobEntity.getJobId());
            DeviceClientFactory.getInstance().sendDeviceMessage(scheduleJobEntity.getBeanName());
            // 执行耗时
            long time = System.currentTimeMillis() - startTime;
            scheduleJobLogEntity.setTimes((int)time);
            scheduleJobLogEntity.setStatus(0);

            log.info("任务执行完成，任务ID: {}，总耗时: {}", scheduleJobEntity.getJobId(), time);
        } catch (Exception e) {
            log.error("任务执行失败，任务ID: {}。MSG: {}", scheduleJobEntity.getJobId(), e.getMessage());
            // 执行耗时
            long time = System.currentTimeMillis() - startTime;
            scheduleJobLogEntity.setTimes((int)time);
            scheduleJobLogEntity.setStatus(1);
            scheduleJobLogEntity.setError(StringUtils.substring(e.toString(), 0, 2000));
        } finally {
            scheduleJobLogService.save(scheduleJobLogEntity);
        }
    }
}

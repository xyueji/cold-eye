package com.xyueji.coldeye.jobs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyueji.coldeye.common.job.dao.ScheduleJobDao;
import com.xyueji.coldeye.common.job.entity.ScheduleJobEntity;
import com.xyueji.coldeye.common.utils.Constant;
import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.jobs.service.ScheduleJobService;
import com.xyueji.coldeye.jobs.utils.ScheduleUtils;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-26 16:23
 * @description
 */
@Service("scheduleJobService")
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobDao, ScheduleJobEntity> implements ScheduleJobService {
    @Resource
    private Scheduler scheduler;

    /**
     * 项目启动时，初始化定时器
     *
     */
    @PostConstruct
    public void init() {
        List<ScheduleJobEntity> scheduleJobList = this.list();

        for (ScheduleJobEntity scheduleJob : scheduleJobList) {
            CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
            // 如果不存在，则创建
            if (cronTrigger == null) {
                ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
            } else {
                ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
            }
        }
    }

    /**
     * 分页查询
     *
     * @param params
     * @return
     */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        // 分页参数
        int current = params.get("page") == null ? 1 : Integer.valueOf(params.get("page").toString());
        int size = params.get("pagesize") == null ? 10 : Integer.valueOf(params.get("pagesize").toString());

        String beanName = (String) params.get("beanName");
        Page<ScheduleJobEntity> page = new Page<>(current, size);

        //查询条件
        QueryWrapper<ScheduleJobEntity> wrapper = new QueryWrapper<>();
        wrapper.lambda()
                .like(ScheduleJobEntity::getBeanName, beanName)
                .orderByDesc(ScheduleJobEntity::getCreateTime);
        //查询数据
        IPage<ScheduleJobEntity> result = this.page(page, wrapper);
        return new PageUtils(result);
    }

    /**
     * 保存定时任务
     *
     * @param scheduleJob
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveJob(ScheduleJobEntity scheduleJob) {
        scheduleJob.setCreateTime(new Date());
        scheduleJob.setStatus(Constant.ScheduleStatus.NORMAL.getValue());
        this.save(scheduleJob);
        ScheduleUtils.createScheduleJob(scheduler,  scheduleJob);
    }

    /**
     * 更新定时任务
     *
     * @param scheduleJob
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(ScheduleJobEntity scheduleJob) {
        this.updateById(scheduleJob);
        ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
    }

    /**
     * 批量删除定时任务
     *
     * @param jobIds
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteBatch(Long[] jobIds) {
        this.deleteBatch(jobIds);

        for (Long jobId : jobIds) {
            ScheduleUtils.deleteJob(scheduler, jobId);
        }
    }

    /**
     * 批量更新定时任务
     *
     * @param jobIds
     * @param status
     */
    @Override
    public void updateBatch(Long[] jobIds, int status) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("list", jobIds);
        map.put("status", status);

        baseMapper.updateBatch(map);
    }

    /**
     * 立即执行
     *
     * @param jobIds
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void run(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.run(scheduler, this.getById(jobId));
        }
    }

    /**
     * 暂停执行
     *
     * @param jobIds
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void pause(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.pauseJob(scheduler, jobId);
        }

        updateBatch(jobIds, Constant.ScheduleStatus.PAUSE.getValue());
    }

    /**
     * 恢复执行
     *
     * @param jobIds
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void resume(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.resumeJob(scheduler, jobId);
        }

        updateBatch(jobIds, Constant.ScheduleStatus.NORMAL.getValue());
    }
}

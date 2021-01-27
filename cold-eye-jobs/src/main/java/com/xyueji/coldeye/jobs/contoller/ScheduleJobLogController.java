package com.xyueji.coldeye.jobs.contoller;

import com.xyueji.coldeye.common.job.entity.ScheduleJobLogEntity;
import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.common.utils.ResultResp;
import com.xyueji.coldeye.jobs.service.ScheduleJobLogService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-26 17:00
 * @description
 */
@RestController
@RequestMapping("/system/schedule/log")
public class ScheduleJobLogController {
    @Resource
    private ScheduleJobLogService scheduleJobLogService;

    /**
     * 定时任务日志列表
     */
    @RequestMapping("/list")
    public ResultResp list(@RequestParam Map<String, Object> params) {
        PageUtils page = scheduleJobLogService.queryPage(params);
        return ResultResp.ok().put("page", page);
    }

    /**
     * 定时任务日志信息
     */
    @RequestMapping("/info/{logId}")
    public ResultResp info(@PathVariable("logId") Long logId) {
        ScheduleJobLogEntity log = scheduleJobLogService.getById(logId);
        return ResultResp.ok().put("log", log);
    }
}

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
    * @api {GET} system/schedule/log/list 定时任务日志列表
    * @apiDescription 定时任务日志列表
    * @apiGroup ScheduleJobLogController
    * @apiParam {Integer} page 当前页
     * @apiParam {Integer} pagesize 页大小
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "page": 1,
    *   "pagesize": 10,
    *   "beanName": "m"
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "code":"0",
    *   "msg":"success",
    *   "data":{
    *
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("/list")
    public ResultResp list(@RequestParam Map<String, Object> params) {
        PageUtils page = scheduleJobLogService.queryPage(params);
        return ResultResp.success(page);
    }

    /**
     * @api {GET} system/schedule/log/info/{logId} 定时任务日志信息
     * @apiDescription 定时任务日志列表
     * @apiGroup ScheduleJobLogController
     *
     * @apiParamExample {json} 请求示例:
     * {
     * }
     * @apiSuccessExample {json} 成功响应:
     * HTTP/1.1 200 OK
     * {
     *   "code":"0",
     *   "msg":"success",
     *   "data":{
     *
     *   }
     * }
     * @apiVersion 1.0.0
     */
    @RequestMapping("/info/{logId}")
    public ResultResp info(@PathVariable("logId") Long logId) {
        ScheduleJobLogEntity log = scheduleJobLogService.getById(logId);
        return ResultResp.success(log);
    }
}

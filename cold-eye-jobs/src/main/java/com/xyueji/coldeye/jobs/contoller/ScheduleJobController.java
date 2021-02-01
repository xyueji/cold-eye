package com.xyueji.coldeye.jobs.contoller;

import com.xyueji.coldeye.common.job.entity.ScheduleJobEntity;
import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.common.utils.ResultResp;
import com.xyueji.coldeye.common.utils.ValidatorUtils;
import com.xyueji.coldeye.jobs.service.ScheduleJobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-26 16:51
 * @description 定时任务
 */
@RestController
@RequestMapping("/system/schedule")
public class ScheduleJobController {
    @Resource
    private ScheduleJobService scheduleJobService;

    /**
     * @api {GET} system/schedule/list 定时任务列表
     * @apiDescription 定时任务列表
     * @apiGroup ScheduleJobController
     * @apiParam {Integer} page 当前页
     * @apiParam {Integer} pagesize 页大小
     * @apiParam {String} beanName 机器名称
     *
     * @apiParamExample {json} 请求示例:
     * {
     *    "page": 1,
     *    "pagesize": 20,
     *    "beanName": "testTask"
     * }
     * @apiSuccessExample {json} 成功响应:
     * HTTP/1.1 200 OK
     * {
     * "code":"0",
     * "msg":"success",
     * "data":{
     *
     *  }
     * }
     * @apiVersion 1.0.0
     */
    @RequestMapping("/list")
    public ResultResp list(@RequestParam Map<String, Object> params) {
        PageUtils page = scheduleJobService.queryPage(params);
        return ResultResp.success(page);
    }

    /**
    * @api {GET} system/schedule/info/{jobId} 定时任务信息
    * @apiDescription 定时任务信息
    * @apiGroup ScheduleJobController
    * @apiParam {Long} jobId 任务ID
    *
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
    @RequestMapping("/info/{jobId}")
    public ResultResp info(@PathVariable("jobId") Long jobId) {
        ScheduleJobEntity schedule = scheduleJobService.getById(jobId);
        return ResultResp.success(schedule);
    }

    /**
    * @api {GET} system/schedule/save 保存定时任务
    * @apiDescription 保存定时任务
    * @apiGroup ScheduleJobController
    * @apiParam {String} beanName 机器名称
    * @apiParam {String} cronExpression 定时表达式
    * @apiParam {String} remark 备注
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "beanName": "testTask",
    *   "cronExpression": "0 * * * * ?",
    *   "remark": "测试"
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
    @RequestMapping("/save")
    public ResultResp save(@RequestBody ScheduleJobEntity scheduleJob) {
        ValidatorUtils.validateEntity(scheduleJob);
        scheduleJobService.saveJob(scheduleJob);
        return ResultResp.success("保存成功！");
    }

    /**
    * @api {GET} system/schedule/update 修改定时任务
    * @apiDescription 修改定时任务
    * @apiGroup ScheduleJobController
    * @apiParam {String} beanName 机器名
    *
    * @apiParam {String} cronExpression 定时表达
    * @apiParam {String} remark 备
    * @apiParamExample {json} 请求示例
    * {
     *   "beanName": "testTask",
     *   "cronExpression": "0 * * * * ?",
     *   "remark": "测试"
     * }
     *
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
    @RequestMapping("/update")
    public ResultResp update(@RequestBody ScheduleJobEntity scheduleJob) {
        ValidatorUtils.validateEntity(scheduleJob);
        scheduleJobService.update(scheduleJob);
        return ResultResp.success("更新成功！");
    }

    /**
    * @api {GET} system/schedule/delete 删除定时任务
    * @apiDescription 删除定时任务
    * @apiGroup ScheduleJobController
    * @apiParam {Array[Long]} jobIds 任务ID列表
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "jobIds": [1, 2]
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
    @RequestMapping("/delete")
    public ResultResp delete(@RequestBody Long[] jobIds) {
        scheduleJobService.deleteBatch(jobIds);
        return ResultResp.success("删除成功！");
    }

    /**
    * @api {GET} system/schedule/run 立即执行任务
    * @apiDescription 立即执行任务
    * @apiGroup ScheduleJobController
    * @apiParam {Array[Long]} jobIds 任务ID列表
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "jobIds": [1, 2]
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
    @RequestMapping("/run")
    public ResultResp run(@RequestBody Long[] jobIds) {
        scheduleJobService.run(jobIds);
        return ResultResp.success("执行成功！");
    }

    /**
    * @api {GET} system/schedule/pause 暂停定时任务
    * @apiDescription 暂停定时任务
    * @apiGroup ScheduleJobController
    * @apiParam {Array[Long]} jobIds 任务ID列表
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "jobIds": [1, 2]
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
    @RequestMapping("/pause")
    public ResultResp pause(@RequestBody Long[] jobIds) {
        scheduleJobService.pause(jobIds);
        return ResultResp.success("暂停成功！");
    }

    /**
    * @api {GET} system/schedule/resume 恢复定时任务
    * @apiDescription 恢复定时任务
    * @apiGroup ScheduleJobController
    * @apiParam {Array[Long]} jobIds 任务ID列表
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "jobIds": [1, 2]
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
    @RequestMapping("/resume")
    public ResultResp resume(@RequestBody Long[] jobIds) {
        scheduleJobService.resume(jobIds);
        return ResultResp.success("删除成功！");
    }
}

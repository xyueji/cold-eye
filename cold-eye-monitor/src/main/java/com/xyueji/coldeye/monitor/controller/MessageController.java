package com.xyueji.coldeye.monitor.controller;

import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.common.utils.ResultResp;
import com.xyueji.coldeye.monitor.service.MessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-28 15:34
 * @description
 */
@RestController
@RequestMapping("device/monitor")
public class MessageController {
    @Resource
    private MessageService messageService;

    /**
    * @api {GET} device/monitor/realtime 实时报警
    * @apiDescription 实时报警
    * @apiGroup MessageController
    * @apiParam {Integer} page 当前页
    * @apiParam {Integer} pagesize 页大小
    * @apiParam {String} meterCode 仪器ID
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "page": 1,
    *   "pagesize": 10,
    *   "meterCode": "xxx"
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
    @RequestMapping("realtime")
    public ResultResp realtime(@RequestParam Map<String, Object> params) {
        PageUtils page = messageService.queryPage(params);

        return ResultResp.ok(page.getPageMap());
    }
}

package com.xyueji.coldeye.druid.controller;

import com.xyueji.coldeye.druid.common.ResultResp;
import com.xyueji.coldeye.druid.service.DruidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("apache-druid/query")
public class DruidController {

	@Autowired
	private DruidService druidService;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	* @api {GET} apache-druid/query/select 查询Druid中数据列表
	* @apiDescription 查询Druid中数据列表
	* @apiGroup DruidController
	* @apiParam {String} meterCode 仪器编号
	 * @apiParam {String} startTime 起始日期
	 * @apiParam {String} endTime 结束日期
	 * @apiParam {Integer} limit 条数
	*
	* @apiParamExample {json} 请求示例:
	* {
	*   "meterCode": "xxx",
	*   "startTime": "2021-01-31 00:00:00",
	*   "endTime": "2021-02-31 00:00:00",
	*   "limit": 20
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
	@RequestMapping(value = "/select")
	public ResultResp select(@RequestParam Map<String, Object> params) {
		return druidService.queryDruidList(params);
	}

	/**
	 * @api {GET} apache-druid/query/temhum 查询Druid中温度湿度数据（设备最近10条数据）
	 * @apiDescription 查询Druid中温度湿度数据（设备最近10条数据）
	 * @apiGroup DruidController
	 * @apiParam {String} meterCode 仪器编号
	 * @apiParam {String} startTime 起始日期
	 * @apiParam {String} endTime 结束日期
	 * @apiParam {Integer} limit 条数
	 *
	 * @apiParamExample {json} 请求示例:
	 * {
	 *   "meterCode": "xxx",
	 *   "startTime": "2021-01-31 00:00:00",
	 *   "endTime": "2021-02-31 00:00:00",
	 *   "limit": 20
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
	@RequestMapping("/temhum")
	public ResultResp temhumLine(@RequestParam Map<String, Object> params) {
		return druidService.queryDruidTumHum(params);
	}
}

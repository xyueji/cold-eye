package com.xyueji.coldeye.admin.controller;

import com.xyueji.coldeye.admin.service.HostService;
import com.xyueji.coldeye.common.admin.entity.HostEntity;
import com.xyueji.coldeye.common.utils.MD5Util;
import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.common.utils.ResultResp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 15:54
 * @description
 */
@RestController
@RequestMapping("admin/host")
public class HostController {
    @Resource
    private HostService hostService;

    /**
    * @api {GET} admin/host/list 主机列表
    * @apiDescription 主机列表
    * @apiGroup HostController
    * @apiParam {Integer} page 当前页
    * @apiParam {Integer} pagesize 页大小
    * @apiParam {String} houseId 库房ID
    * @apiParam {String} houseName 库房名称
    * @apiParam {String} hostCode 主机编码
    * @apiParam {String} hostName 主机名称
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "page": 1,
    *   "pagesize": 10,
    *   "houseId": "xxx",
    *   "houseName": "xxx",
    *   "hostCode": "xxx",
    *   "hostName": "xxx"
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "status": 200,
    *   "data": {
    *     "totalCount": 1,
    *     "pageSize": 10,
    *     "totalPage": 1,
    *     "currPage": 1,
    *     "list": [
    *       {
    *         "id": "436afea4d22ca5847eddcd367e3ac3b4",
    *         "hostCode": "H20210129",
    *         "hostName": "H20210129",
    *         "houseId": "efc0e2f5988676b44b10ff8364cd9253",
    *         "houseCode": "house1",
    *         "houseName": "昌平一号仓",
    *         "hostStatus": 1,
    *         "hostModel": "xxx",
    *         "simCode": "2112324",
    *         "createdTime": "2021-01-29 14:38:16",
    *         "updateTime": "2021-01-29 14:38:16"
    *       }
    *     ],
    *     "pageMap": {
    *       "total": 1,
    *       "page": 1,
    *       "items": [
    *         {
    *           "id": "436afea4d22ca5847eddcd367e3ac3b4",
    *           "hostCode": "H20210129",
    *           "hostName": "H20210129",
    *           "houseId": "efc0e2f5988676b44b10ff8364cd9253",
    *           "houseCode": "house1",
    *           "houseName": "昌平一号仓",
    *           "hostStatus": 1,
    *           "hostModel": "xxx",
    *           "simCode": "2112324",
    *           "createdTime": "2021-01-29 14:38:16",
    *           "updateTime": "2021-01-29 14:38:16"
    *         }
    *       ]
    *     }
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("list")
    public ResultResp list(@RequestParam Map<String, Object> params) {
        PageUtils res = hostService.queryPage(params);
        return ResultResp.success(res);
    }

    /**
    * @api {GET} admin/host/info/{id} 根据ID获取主机信息
    * @apiDescription 根据ID获取主机信息
    * @apiGroup HostController
    * @apiParam {Long} id 主机ID
    *
    * @apiParamExample {json} 请求示例:
    * {
    *
    * }
    * @apiSuccessExample {json} 成功响应:
    * HTTP/1.1 200 OK
    * {
    *   "status": 200,
    *   "data": {
    *     "id": "436afea4d22ca5847eddcd367e3ac3b4",
    *     "hostCode": "H20210129",
    *     "hostName": "H20210129",
    *     "houseId": "efc0e2f5988676b44b10ff8364cd9253",
    *     "houseCode": "house1",
    *     "houseName": "昌平一号仓",
    *     "hostStatus": 1,
    *     "hostModel": "xxx",
    *     "simCode": "2112324",
    *     "createdTime": "2021-01-29 14:38:16",
    *     "updateTime": "2021-01-29 14:38:16"
    *   }
    * }
    * @apiVersion 1.0.0
    */
    @RequestMapping("info/{id}")
    public ResultResp info(@PathVariable("id") String id) {
        HostEntity hostEntity = hostService.getById(id);
        return ResultResp.success(hostEntity);
    }

    /**
    * @api {GET} admin/host/save 新增主机信息
    * @apiDescription 新增主机信息
    * @apiGroup HostController
    * @apiParam {String} hostCode   主机编码
    * @apiParam {String} hostName   主机名称
    * @apiParam {String} houseId    仓库Id
    * @apiParam {String} houseCode  仓库编码
    * @apiParam {String} houseName  仓库名称
    * @apiParam {String} hostStatus 主机状态：1-正常，0-停用
    * @apiParam {String} hostModel  设备型号
    * @apiParam {String} simCode    sim卡号
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "hostCode":"xxx",
    *   "hostName":"xxx",
    *   "houseId":"xxx",
    *   "houseCode" :"xxx",
    *   "houseName" :"xxx",
    *   "hostStatus":"xxx",
    *   "hostModel":"xxx",
    *   "simCode":"xxx",
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
    @RequestMapping("save")
    public ResultResp save(@RequestBody HostEntity hostEntity) {
        hostEntity.setId(MD5Util.enCodeByMd5(hostEntity.toString()));
        hostService.save(hostEntity);
        return ResultResp.success("保存成功！");
    }

    /**
     * @api {GET} admin/host/update 更新主机信息
     * @apiDescription 更新主机信息
     * @apiGroup HostController
     * @apiParam {String} hostCode   主机编码
     * @apiParam {String} hostName   主机名称
     * @apiParam {String} houseId    仓库Id
     * @apiParam {String} houseCode  仓库编码
     * @apiParam {String} houseName  仓库名称
     * @apiParam {String} hostStatus 主机状态：1-正常，0-停用
     * @apiParam {String} hostModel  设备型号
     * @apiParam {String} simCode    sim卡号
     *
     * @apiParamExample {json} 请求示例:
     * {
     *   "hostCode":"xxx",
     *   "hostName":"xxx",
     *   "houseId":"xxx",
     *   "houseCode" :"xxx",
     *   "houseName" :"xxx",
     *   "hostStatus":"xxx",
     *   "hostModel":"xxx",
     *   "simCode":"xxx",
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
    @RequestMapping("update")
    public ResultResp update(@RequestBody HostEntity hostEntity) {
        hostService.updateById(hostEntity);
        return ResultResp.success("更新成功！");
    }

    /**
    * @api {GET} admin/host/delete 删除主机信息
    * @apiDescription 删除主机信息
    * @apiGroup HostController
    * @apiParam {String} id 主机ID
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "id": "xxx"
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
    @RequestMapping("delete")
    public ResultResp delete(String id) {
        hostService.removeById(id);
        return ResultResp.success("删除成功！");
    }
}

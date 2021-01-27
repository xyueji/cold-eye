package com.xyueji.coldeye.admin.controller;

import com.xyueji.coldeye.admin.service.WareHouseService;
import com.xyueji.coldeye.admin.service.WareHouseService;
import com.xyueji.coldeye.common.admin.entity.WareHouseEntity;
import com.xyueji.coldeye.common.utils.MD5Util;
import com.xyueji.coldeye.common.utils.PageUtils;
import com.xyueji.coldeye.common.utils.ResultResp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiongzhigang
 * @date 2021-01-27 15:54
 * @description
 */
@RestController
@RequestMapping("admin/warehouse")
public class WareHouseController {
    @Resource
    private WareHouseService wareHouseService;

    /**
    * @api {GET} admin/warehouse/list 库房列表
    * @apiDescription 库房列表
    * @apiGroup warehouseController
    * @apiParam {Integer} page 当前页
    * @apiParam {Integer} pagesize 页大小
    * @apiParam {String} companyId 公司ID
    * @apiParam {String} companyName 公司名称
    * @apiParam {String} houseCode 库房编号
    * @apiParam {String} houseName 库房名称
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "page": 1,
    *   "pagesize": 10,
    *   "companyId": "xxx",
    *   "companyName": "xxx",
    *   "houseCode": "xx",
    *   "houseName": "xx"
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
    @RequestMapping("list")
    public ResultResp list(@RequestBody Map<String, Object> params) {
        PageUtils res = wareHouseService.queryPage(params);
        return ResultResp.ok(res.getPageMap());
    }

    /**
    * @api {GET} admin/warehouse/info/{id} 根据ID获取库房信息
    * @apiDescription 根据ID获取库房信息
    * @apiGroup warehouseController
    * @apiParam {Long} id 库房ID
    *
    * @apiParamExample {json} 请求示例:
    * {
    *
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
    @RequestMapping("info/{id}")
    public ResultResp info(@PathVariable("id") String id) {
        WareHouseEntity warehouseEntity = wareHouseService.getById(id);
        return ResultResp.ok().put("warehouse", warehouseEntity);
    }

    /**
    * @api {GET} admin/warehouse/save 新增库房信息
    * @apiDescription 新增库房信息
    * @apiGroup warehouseController
    * @apiParam {String} houseCode 仓库编码
    * @apiParam {String} houseName 仓库名称
    * @apiParam {String} houseAddress 仓库地址
    * @apiParam {String} houseType 库房类型：1-冷库， 2-恒温库
    * @apiParam {String} companyId 所属公司Id
    * @apiParam {String} companyName 公司名称
    * @apiParam {String} principalName 负责人
    * @apiParam {String} principalTel 负责人电话
    * @apiParam {String} longitude 经度
    * @apiParam {String} latitude 维度
    * @apiParam {String} areaSize 库房面积
    * @apiParam {String} houseStatus 状态：1-正常,0-空库
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "houseCode     :"xxx",
    *   "houseName     :"xxx",
    *   "houseAddress  :"xxx",
    *   "houseType     :"xxx",
    *   "companyId     :"xxx",,
    *   "companyName   :"xxx",
    *   "principalName :"xxx",,
    *   "principalTel  :"xxx",
    *   "longitude     :"xxx",
    *   "latitude      :"xxx",
    *   "areaSize      :"xxx",
    *   "houseStatus   :"xxx"
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
    public ResultResp save(@RequestBody WareHouseEntity warehouseEntity) {
        warehouseEntity.setId(MD5Util.enCodeByMd5(warehouseEntity.toString()));
        wareHouseService.save(warehouseEntity);
        return ResultResp.ok();
    }

    /**
     * @api {GET} admin/warehouse/update 更新库房信息
     * @apiDescription 新增库房信息
     * @apiGroup warehouseController
     * @apiParam {String} houseCode 仓库编码
     * @apiParam {String} houseName 仓库名称
     * @apiParam {String} houseAddress 仓库地址
     * @apiParam {String} houseType 库房类型：1-冷库， 2-恒温库
     * @apiParam {String} companyId 所属公司Id
     * @apiParam {String} companyName 公司名称
     * @apiParam {String} principalName 负责人
     * @apiParam {String} principalTel 负责人电话
     * @apiParam {String} longitude 经度
     * @apiParam {String} latitude 维度
     * @apiParam {String} areaSize 库房面积
     * @apiParam {String} houseStatus 状态：1-正常,0-空库
     *
     * @apiParamExample {json} 请求示例:
     * {
     *   "houseCode     :"xxx",
     *   "houseName     :"xxx",
     *   "houseAddress  :"xxx",
     *   "houseType     :"xxx",
     *   "companyId     :"xxx",,
     *   "companyName   :"xxx",
     *   "principalName :"xxx",,
     *   "principalTel  :"xxx",
     *   "longitude     :"xxx",
     *   "latitude      :"xxx",
     *   "areaSize      :"xxx",
     *   "houseStatus   :"xxx"
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
    public ResultResp update(@RequestBody WareHouseEntity warehouseEntity) {
        wareHouseService.updateById(warehouseEntity);
        return ResultResp.ok();
    }

    /**
    * @api {GET} admin/warehouse/delete 删除库房信息
    * @apiDescription 删除库房信息
    * @apiGroup warehouseController
    * @apiParam {String} id 库房ID
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
        wareHouseService.removeById(id);
        return ResultResp.ok();
    }
}

package com.xyueji.coldeye.admin.controller;

import com.xyueji.coldeye.admin.service.CompanyService;
import com.xyueji.coldeye.common.admin.entity.CompanyEntity;
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
@RequestMapping("admin/company")
public class CompanyController {
    @Resource
    private CompanyService companyService;

    /**
    * @api {GET} admin/company/list 公司列表
    * @apiDescription 公司列表
    * @apiGroup CompanyController
    * @apiParam {Integer} page 当前页
    * @apiParam {Integer} pagesize 页大小
    * @apiParam {String} company 公司名称
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "page": 1,
    *   "pagesize": 10,
    *   "company": "测试"
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
    public ResultResp list(@RequestParam Map<String, Object> params) {
        PageUtils res = companyService.queryPage(params);
        return ResultResp.ok(res.getPageMap());
    }

    /**
    * @api {GET} admin/company/info/{id} 根据ID获取公司信息
    * @apiDescription 根据ID获取公司信息
    * @apiGroup CompanyController
    * @apiParam {Long} id 公司ID
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
        CompanyEntity companyEntity = companyService.getById(id);
        return ResultResp.ok().put("company", companyEntity);
    }

    /**
    * @api {GET} admin/company/save 新增公司信息
    * @apiDescription 新增公司信息
    * @apiGroup CompanyController
    * @apiParam {String} company 公司名称
    * @apiParam {String} abbreviation 公司简称
    * @apiParam {String} companyNumber 企业编号
    * @apiParam {String} companyAddress 企业地址
    * @apiParam {String} companyPhone 公司电话
    * @apiParam {String} managementName 质量管理员
    * @apiParam {String} managementPhone 质量管理员联系电话
    * @apiParam {String} leader 负责人姓名
    * @apiParam {String} leaderPhone 负责人电话
    * @apiParam {String} message 备注
    * @apiParam {String} webAddress 网站
    * @apiParam {String} companyType 企业类型
    *
    * @apiParamExample {json} 请求示例:
    * {
    *   "company": "迅达仓储",
    *   "abbreviation": "迅达",
    *   "companyNumber": "",
    *   "companyAddress": "迅达",
    *   "companyPhone": "010-87631128",
    *   "managementName": "李四",
    *   "managementPhone": "13911233321",
    *   "leader": "",
    *   "leaderPhone": "",
    *   "message": "",
    *   "webAddress": "",
    *   "companyType": "私企"
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
    public ResultResp save(@RequestBody CompanyEntity companyEntity) {
        companyEntity.setId(MD5Util.enCodeByMd5(companyEntity.toString()));
        companyService.save(companyEntity);
        return ResultResp.ok();
    }

    /**
     * @api {GET} admin/company/update 更新公司信息
     * @apiDescription 更新公司信息
     * @apiGroup CompanyController
     * @apiParam {String} company 公司名称
     * @apiParam {String} abbreviation 公司简称
     * @apiParam {String} companyNumber 企业编号
     * @apiParam {String} companyAddress 企业地址
     * @apiParam {String} companyPhone 公司电话
     * @apiParam {String} managementName 质量管理员
     * @apiParam {String} managementPhone 质量管理员联系电话
     * @apiParam {String} leader 负责人姓名
     * @apiParam {String} leaderPhone 负责人电话
     * @apiParam {String} message 备注
     * @apiParam {String} webAddress 网站
     * @apiParam {String} companyType 企业类型
     *
     * @apiParamExample {json} 请求示例:
     * {
     *   "id": "xxx"
     *   "company": "迅达仓储",
     *   "abbreviation": "迅达",
     *   "companyNumber": "",
     *   "companyAddress": "迅达",
     *   "companyPhone": "010-87631128",
     *   "managementName": "李四",
     *   "managementPhone": "13911233321",
     *   "leader": "",
     *   "leaderPhone": "",
     *   "message": "",
     *   "webAddress": "",
     *   "companyType": "私企"
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
    public ResultResp update(@RequestBody CompanyEntity companyEntity) {
        companyService.updateById(companyEntity);
        return ResultResp.ok();
    }

    /**
    * @api {GET} admin/company/delete 删除公司信息
    * @apiDescription 删除公司信息
    * @apiGroup CompanyController
    * @apiParam {String} id 公司ID
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
        companyService.removeById(id);
        return ResultResp.ok();
    }
}

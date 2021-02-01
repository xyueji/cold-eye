define({ "api": [
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "cold-eye/docs/api-doc/main.js",
    "group": "/Users/xiongzhigang/xiong/project/cold-eye/docs/api-doc/main.js",
    "groupTitle": "/Users/xiongzhigang/xiong/project/cold-eye/docs/api-doc/main.js",
    "name": ""
  },
  {
    "type": "GET",
    "url": "admin/company/delete",
    "title": "删除公司信息",
    "description": "<p>删除公司信息</p>",
    "group": "CompanyController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>公司ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"id\": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/CompanyController.java",
    "groupTitle": "CompanyController",
    "name": "GetAdminCompanyDelete"
  },
  {
    "type": "GET",
    "url": "admin/company/info/{id}",
    "title": "根据ID获取公司信息",
    "description": "<p>根据ID获取公司信息</p>",
    "group": "CompanyController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>公司ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/CompanyController.java",
    "groupTitle": "CompanyController",
    "name": "GetAdminCompanyInfoId"
  },
  {
    "type": "GET",
    "url": "admin/company/list",
    "title": "公司列表",
    "description": "<p>公司列表</p>",
    "group": "CompanyController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pagesize",
            "description": "<p>页大小</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "company",
            "description": "<p>公司名称</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"page\": 1,\n  \"pagesize\": 10,\n  \"company\": \"测试\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/CompanyController.java",
    "groupTitle": "CompanyController",
    "name": "GetAdminCompanyList"
  },
  {
    "type": "GET",
    "url": "admin/company/save",
    "title": "新增公司信息",
    "description": "<p>新增公司信息</p>",
    "group": "CompanyController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "company",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "abbreviation",
            "description": "<p>公司简称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyNumber",
            "description": "<p>企业编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyAddress",
            "description": "<p>企业地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyPhone",
            "description": "<p>公司电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "managementName",
            "description": "<p>质量管理员</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "managementPhone",
            "description": "<p>质量管理员联系电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "leader",
            "description": "<p>负责人姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "leaderPhone",
            "description": "<p>负责人电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>备注</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "webAddress",
            "description": "<p>网站</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyType",
            "description": "<p>企业类型</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"company\": \"迅达仓储\",\n  \"abbreviation\": \"迅达\",\n  \"companyNumber\": \"\",\n  \"companyAddress\": \"迅达\",\n  \"companyPhone\": \"010-87631128\",\n  \"managementName\": \"李四\",\n  \"managementPhone\": \"13911233321\",\n  \"leader\": \"\",\n  \"leaderPhone\": \"\",\n  \"message\": \"\",\n  \"webAddress\": \"\",\n  \"companyType\": \"私企\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/CompanyController.java",
    "groupTitle": "CompanyController",
    "name": "GetAdminCompanySave"
  },
  {
    "type": "GET",
    "url": "admin/company/update",
    "title": "更新公司信息",
    "description": "<p>更新公司信息</p>",
    "group": "CompanyController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "company",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "abbreviation",
            "description": "<p>公司简称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyNumber",
            "description": "<p>企业编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyAddress",
            "description": "<p>企业地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyPhone",
            "description": "<p>公司电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "managementName",
            "description": "<p>质量管理员</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "managementPhone",
            "description": "<p>质量管理员联系电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "leader",
            "description": "<p>负责人姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "leaderPhone",
            "description": "<p>负责人电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>备注</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "webAddress",
            "description": "<p>网站</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyType",
            "description": "<p>企业类型</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"id\": \"xxx\"\n  \"company\": \"迅达仓储\",\n  \"abbreviation\": \"迅达\",\n  \"companyNumber\": \"\",\n  \"companyAddress\": \"迅达\",\n  \"companyPhone\": \"010-87631128\",\n  \"managementName\": \"李四\",\n  \"managementPhone\": \"13911233321\",\n  \"leader\": \"\",\n  \"leaderPhone\": \"\",\n  \"message\": \"\",\n  \"webAddress\": \"\",\n  \"companyType\": \"私企\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/CompanyController.java",
    "groupTitle": "CompanyController",
    "name": "GetAdminCompanyUpdate"
  },
  {
    "type": "GET",
    "url": "apache-druid/query/select",
    "title": "查询Druid中数据列表",
    "description": "<p>查询Druid中数据列表</p>",
    "group": "DruidController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterCode",
            "description": "<p>仪器编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "startTime",
            "description": "<p>起始日期</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "endTime",
            "description": "<p>结束日期</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "limit",
            "description": "<p>条数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"meterCode\": \"xxx\",\n  \"startTime\": \"2021-01-31 00:00:00\",\n  \"endTime\": \"2021-02-31 00:00:00\",\n  \"limit\": 20\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-druid/src/main/java/com/xyueji/coldeye/druid/controller/DruidController.java",
    "groupTitle": "DruidController",
    "name": "GetApacheDruidQuerySelect"
  },
  {
    "type": "GET",
    "url": "apache-druid/query/temhum",
    "title": "查询Druid中温度湿度数据（设备最近10条数据）",
    "description": "<p>查询Druid中温度湿度数据（设备最近10条数据）</p>",
    "group": "DruidController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterCode",
            "description": "<p>仪器编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "startTime",
            "description": "<p>起始日期</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "endTime",
            "description": "<p>结束日期</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "limit",
            "description": "<p>条数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"meterCode\": \"xxx\",\n  \"startTime\": \"2021-01-31 00:00:00\",\n  \"endTime\": \"2021-02-31 00:00:00\",\n  \"limit\": 20\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-druid/src/main/java/com/xyueji/coldeye/druid/controller/DruidController.java",
    "groupTitle": "DruidController",
    "name": "GetApacheDruidQueryTemhum"
  },
  {
    "type": "GET",
    "url": "admin/host/delete",
    "title": "删除主机信息",
    "description": "<p>删除主机信息</p>",
    "group": "HostController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>主机ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"id\": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/HostController.java",
    "groupTitle": "HostController",
    "name": "GetAdminHostDelete"
  },
  {
    "type": "GET",
    "url": "admin/host/info/{id}",
    "title": "根据ID获取主机信息",
    "description": "<p>根据ID获取主机信息</p>",
    "group": "HostController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>主机ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/HostController.java",
    "groupTitle": "HostController",
    "name": "GetAdminHostInfoId"
  },
  {
    "type": "GET",
    "url": "admin/host/list",
    "title": "主机列表",
    "description": "<p>主机列表</p>",
    "group": "HostController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pagesize",
            "description": "<p>页大小</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseId",
            "description": "<p>库房ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>库房名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostCode",
            "description": "<p>主机编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostName",
            "description": "<p>主机名称</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"page\": 1,\n  \"pagesize\": 10,\n  \"houseId\": \"xxx\",\n  \"houseName\": \"xxx\",\n  \"hostCode\": \"xxx\",\n  \"hostName\": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/HostController.java",
    "groupTitle": "HostController",
    "name": "GetAdminHostList"
  },
  {
    "type": "GET",
    "url": "admin/host/save",
    "title": "新增主机信息",
    "description": "<p>新增主机信息</p>",
    "group": "HostController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostCode",
            "description": "<p>主机编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostName",
            "description": "<p>主机名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseId",
            "description": "<p>仓库Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>仓库编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>仓库名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostStatus",
            "description": "<p>主机状态：1-正常，0-停用</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostModel",
            "description": "<p>设备型号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "simCode",
            "description": "<p>sim卡号</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"hostCode\":\"xxx\",\n  \"hostName\":\"xxx\",\n  \"houseId\":\"xxx\",\n  \"houseCode\" :\"xxx\",\n  \"houseName\" :\"xxx\",\n  \"hostStatus\":\"xxx\",\n  \"hostModel\":\"xxx\",\n  \"simCode\":\"xxx\",\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/HostController.java",
    "groupTitle": "HostController",
    "name": "GetAdminHostSave"
  },
  {
    "type": "GET",
    "url": "admin/host/update",
    "title": "更新主机信息",
    "description": "<p>更新主机信息</p>",
    "group": "HostController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostCode",
            "description": "<p>主机编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostName",
            "description": "<p>主机名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseId",
            "description": "<p>仓库Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>仓库编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>仓库名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostStatus",
            "description": "<p>主机状态：1-正常，0-停用</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostModel",
            "description": "<p>设备型号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "simCode",
            "description": "<p>sim卡号</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"hostCode\":\"xxx\",\n  \"hostName\":\"xxx\",\n  \"houseId\":\"xxx\",\n  \"houseCode\" :\"xxx\",\n  \"houseName\" :\"xxx\",\n  \"hostStatus\":\"xxx\",\n  \"hostModel\":\"xxx\",\n  \"simCode\":\"xxx\",\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/HostController.java",
    "groupTitle": "HostController",
    "name": "GetAdminHostUpdate"
  },
  {
    "type": "GET",
    "url": "device/monitor/realtime",
    "title": "实时报警",
    "description": "<p>实时报警</p>",
    "group": "MessageController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pagesize",
            "description": "<p>页大小</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterCode",
            "description": "<p>仪器ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"page\": 1,\n  \"pagesize\": 10,\n  \"meterCode\": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-monitor/src/main/java/com/xyueji/coldeye/monitor/controller/MessageController.java",
    "groupTitle": "MessageController",
    "name": "GetDeviceMonitorRealtime"
  },
  {
    "type": "GET",
    "url": "admin/meter/delete",
    "title": "删除仪器信息",
    "description": "<p>删除仪器信息</p>",
    "group": "MeterController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>仪器ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"id\": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/MeterController.java",
    "groupTitle": "MeterController",
    "name": "GetAdminMeterDelete"
  },
  {
    "type": "GET",
    "url": "admin/meter/info/{id}",
    "title": "根据ID获取仪器信息",
    "description": "<p>根据ID获取仪器信息</p>",
    "group": "MeterController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>仪器ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/MeterController.java",
    "groupTitle": "MeterController",
    "name": "GetAdminMeterInfoId"
  },
  {
    "type": "GET",
    "url": "admin/meter/list",
    "title": "仪器列表",
    "description": "<p>仪器列表</p>",
    "group": "MeterController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pagesize",
            "description": "<p>页大小</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostId",
            "description": "<p>主机ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyName",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>库房名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostName",
            "description": "<p>主机名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterCode",
            "description": "<p>仪器ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterName",
            "description": "<p>仪器名称</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"page\": 1,\n  \"pagesize\": 10,\n  \"hostId\": \"xxx\",\n  \"companyName: \"xxx\",\n  \"houseName: \"xxx\",\n  \"hostName: \"xxx\",\n  \"meterCode: \"xxx\",\n  \"meterName: \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/MeterController.java",
    "groupTitle": "MeterController",
    "name": "GetAdminMeterList"
  },
  {
    "type": "GET",
    "url": "admin/meter/save",
    "title": "新增仪器信息",
    "description": "<p>新增仪器信息</p>",
    "group": "MeterController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterCode",
            "description": "<p>设备编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterName",
            "description": "<p>设备名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostId",
            "description": "<p>主机ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostCode",
            "description": "<p>主机编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostName",
            "description": "<p>主机名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseId",
            "description": "<p>仓库Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>仓库编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>仓库名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyId",
            "description": "<p>公司Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyName",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterStatus",
            "description": "<p>仪表状态(1-在用,0-停用,2-异常)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "maxTem",
            "description": "<p>温度上限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "minTem",
            "description": "<p>温度下限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "maxHum",
            "description": "<p>湿度上限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "minHum",
            "description": "<p>湿度下限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterInterval",
            "description": "<p>采集间隔</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "remarks",
            "description": "<p>备注信息</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"meterCode\": \"xxx\",\n  \"meterName\": \"xxx\",\n  \"hostId\": \"xxx\",\n  \"hostCode\": \"xxx\",\n  \"hostName\": \"xxx\",\n  \"houseId\": \"xxx\",\n  \"houseCode\": \"xxx\",21\",\n  \"houseName\": \"xxx\",\n  \"companyId\": \"xxx\",\n  \"companyName\": \"xxx\",\n  \"meterStatus\": \"xxx\",\n  \"maxTem\": \"xxx\",\n   \"minTem       \": \"xxx\",\n  \"maxHum       \": \"xxx\",\n  \"minHum       \": \"xxx\",\n  \"meterInterval\": \"xxx\",\n  \"remarks      \": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/MeterController.java",
    "groupTitle": "MeterController",
    "name": "GetAdminMeterSave"
  },
  {
    "type": "GET",
    "url": "admin/meter/update",
    "title": "更新仪器信息",
    "description": "<p>更新仪器信息</p>",
    "group": "MeterController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterCode",
            "description": "<p>设备编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterName",
            "description": "<p>设备名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostId",
            "description": "<p>主机ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostCode",
            "description": "<p>主机编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "hostName",
            "description": "<p>主机名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseId",
            "description": "<p>仓库Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>仓库编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>仓库名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyId",
            "description": "<p>公司Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyName",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterStatus",
            "description": "<p>仪表状态(1-在用,0-停用,2-异常)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "maxTem",
            "description": "<p>温度上限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "minTem",
            "description": "<p>温度下限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "maxHum",
            "description": "<p>湿度上限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "minHum",
            "description": "<p>湿度下限</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "meterInterval",
            "description": "<p>采集间隔</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "remarks",
            "description": "<p>备注信息</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"meterCode\": \"xxx\",\n  \"meterName\": \"xxx\",\n  \"hostId\": \"xxx\",\n  \"hostCode\": \"xxx\",\n  \"hostName\": \"xxx\",\n  \"houseId\": \"xxx\",\n  \"houseCode\": \"xxx\",21\",\n  \"houseName\": \"xxx\",\n  \"companyId\": \"xxx\",\n  \"companyName\": \"xxx\",\n  \"meterStatus\": \"xxx\",\n  \"maxTem\": \"xxx\",\n  \"minTem       \": \"xxx\",\n  \"maxHum       \": \"xxx\",\n  \"minHum       \": \"xxx\",\n  \"meterInterval\": \"xxx\",\n  \"remarks      \": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/MeterController.java",
    "groupTitle": "MeterController",
    "name": "GetAdminMeterUpdate"
  },
  {
    "type": "GET",
    "url": "system/schedule/delete",
    "title": "删除定时任务",
    "description": "<p>删除定时任务</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Array[Long]",
            "optional": false,
            "field": "jobIds",
            "description": "<p>任务ID列表</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"jobIds\": [1, 2]\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleDelete"
  },
  {
    "type": "GET",
    "url": "system/schedule/info/{jobId}",
    "title": "定时任务信息",
    "description": "<p>定时任务信息</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "jobId",
            "description": "<p>任务ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleInfoJobid"
  },
  {
    "type": "GET",
    "url": "system/schedule/list",
    "title": "定时任务列表",
    "description": "<p>定时任务列表</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pagesize",
            "description": "<p>页大小</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "beanName",
            "description": "<p>机器名称</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n   \"page\": 1,\n   \"pagesize\": 20,\n   \"beanName\": \"testTask\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n\"code\":\"0\",\n\"msg\":\"success\",\n\"data\":{\n\n }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleList"
  },
  {
    "type": "GET",
    "url": "system/schedule/pause",
    "title": "暂停定时任务",
    "description": "<p>暂停定时任务</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Array[Long]",
            "optional": false,
            "field": "jobIds",
            "description": "<p>任务ID列表</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"jobIds\": [1, 2]\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemSchedulePause"
  },
  {
    "type": "GET",
    "url": "system/schedule/resume",
    "title": "恢复定时任务",
    "description": "<p>恢复定时任务</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Array[Long]",
            "optional": false,
            "field": "jobIds",
            "description": "<p>任务ID列表</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"jobIds\": [1, 2]\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleResume"
  },
  {
    "type": "GET",
    "url": "system/schedule/run",
    "title": "立即执行任务",
    "description": "<p>立即执行任务</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Array[Long]",
            "optional": false,
            "field": "jobIds",
            "description": "<p>任务ID列表</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"jobIds\": [1, 2]\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleRun"
  },
  {
    "type": "GET",
    "url": "system/schedule/save",
    "title": "保存定时任务",
    "description": "<p>保存定时任务</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "beanName",
            "description": "<p>机器名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cronExpression",
            "description": "<p>定时表达式</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "remark",
            "description": "<p>备注</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"beanName\": \"testTask\",\n  \"cronExpression\": \"0 * * * * ?\",\n  \"remark\": \"测试\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleSave"
  },
  {
    "type": "GET",
    "url": "system/schedule/update",
    "title": "修改定时任务",
    "description": "<p>修改定时任务</p>",
    "group": "ScheduleJobController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "beanName",
            "description": "<p>机器名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "cronExpression",
            "description": "<p>定时表达</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "remark",
            "description": "<p>备</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例",
          "content": "{\n  \"beanName\": \"testTask\",\n  \"cronExpression\": \"0 * * * * ?\",\n  \"remark\": \"测试\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-jobs/src/main/java/com/xyueji/coldeye/jobs/contoller/ScheduleJobController.java",
    "groupTitle": "ScheduleJobController",
    "name": "GetSystemScheduleUpdate"
  },
  {
    "type": "POST",
    "url": "sys/user/getToken",
    "title": "获取token",
    "description": "<p>获取token</p>",
    "group": "UserController",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "token",
            "defaultValue": "token",
            "description": ""
          }
        ]
      }
    },
    "parameter": {
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-user/src/main/java/com/xyueji/coldeye/user/controller/UserController.java",
    "groupTitle": "UserController",
    "name": "PostSysUserGettoken"
  },
  {
    "type": "POST",
    "url": "sys/user/info",
    "title": "用户信息",
    "description": "<p>用户信息</p>",
    "group": "UserController",
    "parameter": {
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-user/src/main/java/com/xyueji/coldeye/user/controller/UserController.java",
    "groupTitle": "UserController",
    "name": "PostSysUserInfo"
  },
  {
    "type": "post",
    "url": "sys/user/login",
    "title": "登录",
    "description": "<p>登录</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "username",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n \"username\": \"admin\",\n \"password\": \"admin123\"\n}",
          "type": "json"
        }
      ]
    },
    "group": "UserController",
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-user/src/main/java/com/xyueji/coldeye/user/controller/UserController.java",
    "groupTitle": "UserController",
    "name": "PostSysUserLogin"
  },
  {
    "type": "POST",
    "url": "sys/user/logout",
    "title": "登出",
    "description": "<p>登出</p>",
    "group": "UserController",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "name",
            "defaultValue": "desc",
            "description": ""
          }
        ]
      }
    },
    "parameter": {
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-user/src/main/java/com/xyueji/coldeye/user/controller/UserController.java",
    "groupTitle": "UserController",
    "name": "PostSysUserLogout"
  },
  {
    "type": "GET",
    "url": "admin/warehouse/delete",
    "title": "删除库房信息",
    "description": "<p>删除库房信息</p>",
    "group": "warehouseController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>库房ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"id\": \"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/WareHouseController.java",
    "groupTitle": "warehouseController",
    "name": "GetAdminWarehouseDelete"
  },
  {
    "type": "GET",
    "url": "admin/warehouse/info/{id}",
    "title": "根据ID获取库房信息",
    "description": "<p>根据ID获取库房信息</p>",
    "group": "warehouseController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>库房ID</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/WareHouseController.java",
    "groupTitle": "warehouseController",
    "name": "GetAdminWarehouseInfoId"
  },
  {
    "type": "GET",
    "url": "admin/warehouse/list",
    "title": "库房列表",
    "description": "<p>库房列表</p>",
    "group": "warehouseController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "page",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pagesize",
            "description": "<p>页大小</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyId",
            "description": "<p>公司ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyName",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>库房编号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>库房名称</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"page\": 1,\n  \"pagesize\": 10,\n  \"companyId\": \"xxx\",\n  \"companyName\": \"xxx\",\n  \"houseCode\": \"xx\",\n  \"houseName\": \"xx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/WareHouseController.java",
    "groupTitle": "warehouseController",
    "name": "GetAdminWarehouseList"
  },
  {
    "type": "GET",
    "url": "admin/warehouse/save",
    "title": "新增库房信息",
    "description": "<p>新增库房信息</p>",
    "group": "warehouseController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>仓库编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>仓库名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseAddress",
            "description": "<p>仓库地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseType",
            "description": "<p>库房类型：1-冷库， 2-恒温库</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyId",
            "description": "<p>所属公司Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyName",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "principalName",
            "description": "<p>负责人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "principalTel",
            "description": "<p>负责人电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "longitude",
            "description": "<p>经度</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "latitude",
            "description": "<p>维度</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "areaSize",
            "description": "<p>库房面积</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseStatus",
            "description": "<p>状态：1-正常,0-空库</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"houseCode     :\"xxx\",\n  \"houseName     :\"xxx\",\n  \"houseAddress  :\"xxx\",\n  \"houseType     :\"xxx\",\n  \"companyId     :\"xxx\",,\n  \"companyName   :\"xxx\",\n  \"principalName :\"xxx\",,\n  \"principalTel  :\"xxx\",\n  \"longitude     :\"xxx\",\n  \"latitude      :\"xxx\",\n  \"areaSize      :\"xxx\",\n  \"houseStatus   :\"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/WareHouseController.java",
    "groupTitle": "warehouseController",
    "name": "GetAdminWarehouseSave"
  },
  {
    "type": "GET",
    "url": "admin/warehouse/update",
    "title": "更新库房信息",
    "description": "<p>新增库房信息</p>",
    "group": "warehouseController",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseCode",
            "description": "<p>仓库编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseName",
            "description": "<p>仓库名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseAddress",
            "description": "<p>仓库地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseType",
            "description": "<p>库房类型：1-冷库， 2-恒温库</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyId",
            "description": "<p>所属公司Id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "companyName",
            "description": "<p>公司名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "principalName",
            "description": "<p>负责人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "principalTel",
            "description": "<p>负责人电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "longitude",
            "description": "<p>经度</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "latitude",
            "description": "<p>维度</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "areaSize",
            "description": "<p>库房面积</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "houseStatus",
            "description": "<p>状态：1-正常,0-空库</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例:",
          "content": "{\n  \"houseCode     :\"xxx\",\n  \"houseName     :\"xxx\",\n  \"houseAddress  :\"xxx\",\n  \"houseType     :\"xxx\",\n  \"companyId     :\"xxx\",,\n  \"companyName   :\"xxx\",\n  \"principalName :\"xxx\",,\n  \"principalTel  :\"xxx\",\n  \"longitude     :\"xxx\",\n  \"latitude      :\"xxx\",\n  \"areaSize      :\"xxx\",\n  \"houseStatus   :\"xxx\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "成功响应:",
          "content": "HTTP/1.1 200 OK\n{\n  \"code\":\"0\",\n  \"msg\":\"success\",\n  \"data\":{\n\n  }\n}",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "filename": "cold-eye/cold-eye-admin/src/main/java/com/xyueji/coldeye/admin/controller/WareHouseController.java",
    "groupTitle": "warehouseController",
    "name": "GetAdminWarehouseUpdate"
  }
] });

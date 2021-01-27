# 冰眼冷链系统

### 演示地址：


[http://mp-bingyan-java.itheima.net/cold/index.html](http://mp-bingyan-java.itheima.net/cold/index.html)


#### 项目介绍


冰眼冷链物流设备监控系统，是一款应用于食品生鲜、医药冷链的仓储、运输环节中针对温度、湿度、电量等进行监控、预警和统计分析的系统。实现了冷链监控环节的数据采集自动化、监控指标配置化、预警通知自动化、统计分析可视化，从而提升了生鲜、药品仓储、运输的安全管控水平，增强了企业对业务各环节的管理和控制。


#### 冷链监控


因为在冷链物资流转过程中，对物资的生产、运输、存储、销售时的温度、湿度等各种指标要求比较高，为了减轻人工成本、提高设备检测的可靠性，需要专门的软件系统来进行系统化、自动化操作。


冷眼物流设备监控系统是一款应用于对食品、药品冷链仓储、运输的环节中针对温度、湿度、电量等进行监控、预警和统计分析的系统。
实现了冷链监控环节的：


- 数据采集自动化
- 监控指标配置化
- 预警通知自动化
- 统计分析可视化



从而提升了生鲜、药品仓储、运输的安全管控水平，增强了政府、企业对业务各环节的了解和管理。


#### 系统用例图


![](https://cdn.nlark.com/yuque/0/2021/png/1857924/1611748420454-21ac77e5-5b17-4e6c-ba6b-917a58bf3985.png#align=left&display=inline&height=375&margin=%5Bobject%20Object%5D&originHeight=375&originWidth=733&size=0&status=done&style=none&width=733)


#### 任务流程图


![](https://cdn.nlark.com/yuque/0/2021/png/1857924/1611748420464-26d08230-5d1e-4fd3-ad51-7bb10ce1af06.png#align=left&display=inline&height=376&margin=%5Bobject%20Object%5D&originHeight=376&originWidth=830&size=0&status=done&style=none&width=830)


#### 数据流程图


![](https://cdn.nlark.com/yuque/0/2021/png/1857924/1611748420361-b5def960-04a6-4d94-88c2-ba87a84126ad.png#align=left&display=inline&height=392&margin=%5Bobject%20Object%5D&originHeight=392&originWidth=743&size=0&status=done&style=none&width=743)


#### 系统架构图


![](https://cdn.nlark.com/yuque/0/2021/png/1857924/1611748420312-3884c7c5-7f66-4740-988f-3f684f232ed2.png#align=left&display=inline&height=509&margin=%5Bobject%20Object%5D&originHeight=509&originWidth=709&size=0&status=done&style=none&width=709)


#### 技术架构图


![](https://cdn.nlark.com/yuque/0/2021/png/1857924/1611748420531-2350ad61-7b39-4cf6-a73b-25996a4b6cc4.png#align=left&display=inline&height=602&margin=%5Bobject%20Object%5D&originHeight=602&originWidth=705&size=0&status=done&style=none&width=705)


#### 物理部署图


![](https://cdn.nlark.com/yuque/0/2021/png/1857924/1611748420377-0c2e4310-35fc-4f60-9f9e-7fe5f50921c4.png#align=left&display=inline&height=552&margin=%5Bobject%20Object%5D&originHeight=552&originWidth=813&size=0&status=done&style=none&width=813)


#### 微服务拆分


```
cold
├── cold-eye-user # 用户服务
├── cold-eye-admin # 业务管理、系统管理服务
└── cold-eye-common # 对象实体、公共组件
└── cold-eye-monitor # 实时数据查询
└── cold-eye-druid # 历史数据查询
└── cold-eye-eureka # Spring cloud服务注册中心
└── cold-eye-gateway # Spring cloud网关
└── cold-eye-flink # 实时数据处理
└── cold-eye-jobs # 分布式任务调度（硬件模拟）
└── cold-eye-netty # 设备报文接收服务
└── docs # 项目文档
cold-ui         # 前台页面
```


- cold-eye-eureka 8001 服务注册中心
- cold-eye-gateway 8080 API网关，前端统一
- cold-eye-user 8185 用户服务
- cold-eye-admin 8181 管理服务
- cold-eye-druid 8182 Druid查询服务
- cold-eye-monitor 8183 实时查询服务
- cold-eye-jobs 8184 定时任务服务
- cold-eye-netty-server 10010 netty服务器
- cold-eye-ui 8000 web服务



docker安装软件


- docker run --name superset -d -p 7088:8088 -v /opt/docker/superset:/home/superset amancevice/superset
初始化superset数据库
- docker exec -it superset superset db upgrade
初始化superset
- docker exec -it superset superset init
设置用户名和密码， 密码设置为： admin123
- docker exec -it superset fabmanager create-admin --app superset



### 接口文档
[https://xyueji.github.io/cold-eye/api-doc/](https://xyueji.github.io/cold-eye/api-doc/)


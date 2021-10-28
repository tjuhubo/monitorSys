# B/S后端（初版）

## 实现功能

* 查询客户端上线日志
  - registerlog
  - 方法： getAll
  - API：/log
* 查询所有上线客户端
  - online
  - 方法 ：getAllOn
  - API：/client

* 获取某个客户端状态
  - online
  - 方法：name
  - API：/name
* 删除+下线（未实现）客户端
  - online
  - 方法：delByName
  - API：delclient

## 技术栈

* springboot
* mybatis
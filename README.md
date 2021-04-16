```
██████╗ ██╗ ██████╗ ██████╗  █████╗ ████████╗ █████╗ ████████╗ ██████╗  ██████╗ ██╗
██╔══██╗██║██╔════╝ ██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗╚══██╔══╝██╔═══██╗██╔═══██╗██║
██████╔╝██║██║  ███╗██║  ██║███████║   ██║   ███████║   ██║   ██║   ██║██║   ██║██║
██╔══██╗██║██║   ██║██║  ██║██╔══██║   ██║   ██╔══██║   ██║   ██║   ██║██║   ██║██║ 
██████╔╝██║╚██████╔╝██████╔╝██║  ██║   ██║   ██║  ██║   ██║   ╚██████╔╝╚██████╔╝███████╗
╚═════╝ ╚═╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝   ╚═╝    ╚═════╝  ╚═════╝ ╚══════╝
```

# **BigDataTool**


BigDataTool 是一个开源的分布式大数据管理工具，目前还是早期版本，只支持Hadoop的部署。



## 介绍


BigDataTool主要由基于Vue.js的UI和基于gpc和SpringBoot的后端分布式服务组成。



## 组件


|                             项目                             |          介绍          |
| :----------------------------------------------------------: | :--------------------: |
| [BigDataTool-UI](https://github.com/cyz1901/BigDataTool-UI)  |  BigDataTool的前端UI   |
| [BigDataTool-Shell](https://github.com/cyz1901/BigDataTool-Shell) | BigDataTool的Shell模块 |



## Issue

打包Jar包时

不建议使用idea提供的功能，因为使用spring-boot-maven-plugin可能会造成反射功能不可用，需要在打包完时在jar包内的spring.factories加上项目spring-boot-autoconfigure-2.4.2.jar中spring.factories的# Auto Configure部分。

在启动springboot时默认端口为8080若需要更改可以使用例如

```shell
java -Dserver.port=9999 -jar bigdatatool-service.jar
```

来改变spring监听的端口

使用maven自带的package功能更好
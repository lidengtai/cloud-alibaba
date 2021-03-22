# cloud-alibaba
=====================================================spring cloud================================================================
spring+alibaba 架构搭建
热部署 Devtools  
eureka服务中心配置及集群环境配置
提供服务端集群环境配置
zookeeper服务中心配置及集群环境配置
服务提供端和服务调用端注册到zookeeper

win10 安装consul 
cmd 命令 consul.exe agent -dev 
http://localhost:8500/访问

配置Ribbon负载均衡 手写负载均衡算法

配置openfeign 组件的服务调用 超时配置 日志配置

配置中心
http://config-3344.com:3344/master/config-dev.yml

消息总线
bus


链路追踪
sleuth+zipkin
启动zipkin  cmd： java -jar zipkin-server-2.10.1-exec.jar
http://localhost:9411/zipkin/


==============================================================cloud alibaba=================================================
springcloud+alibaba
https://spring-cloud-alibaba-group.github.io/github-pages/hoxton/zh-cn/index.html


nacos:
Nacos Server 启动后，进入 http://ip:8848 查看控制台(默认账号名/密码为 nacos/nacos):
http://192.168.10.109:8848/nacos/index.html#/login 单机版

http://192.168.11.120:1111/nacos 集群版+Nginx负载均衡

mysql：192.168.11.110

server 192.168.11.110:8848;
server 192.168.11.111:8848;
server 192.168.11.112:8848;

/usr/local/webserver/nginx/sbin/nginx 启动服务
/usr/local/webserver/nginx/sbin/nginx -t 查看nginx状态



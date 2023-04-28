

## 简介

Spring Boot + Vue 博客系统


## 后端

1. 核心框架：[Spring Boot](https://github.com/spring-projects/spring-boot)
2. 安全框架：[Spring Security](https://github.com/spring-projects/spring-security)
3. Token：[jjwt](https://github.com/jwtk/jjwt)
4. ORM 框架：[MyBatis](https://github.com/mybatis/spring-boot-starter)
5. 分页插件：[PageHelper](https://github.com/pagehelper/Mybatis-PageHelper)
6. NoSQL 缓存：[Redis](https://github.com/redis/redis)
7. Markdown 转 HTML：[commonmark-java](https://github.com/commonmark/commonmark-java)
8. 离线 IP 地址库：[ip2region](https://github.com/lionsoul2014/ip2region)
9. 定时任务：[quartz](https://github.com/quartz-scheduler/quartz)
10. UserAgent 解析：[yauaa](https://github.com/nielsbasjes/yauaa)


## 前端

核心框架：Vue2.x、Vue Router、Vuex


## 开发环境

1. 创建 MySQL 数据库`blog`，并执行`/blog-admin/blog.sql`初始化表数据
2. 修改配置信息`/blog-admin/src/main/resources/application-dev.properties`
3. 安装 Redis 并启动
4. 启动后端服务
5. 分别在`blog-admin-vue`和`blog-vue`目录下执行`npm install`安装依赖
6. 分别在`blog-admin-vue`和`blog-vue`目录下执行`npm run serve`启动前后台页面



## 注意事项

一些常见问题：

- MySQL 确保数据库字符集为`utf8mb4`（”站点设置“及”文章详情“等许多表字段需要`utf8mb4`格式字符集来支持 emoji 表情，否则在导入 sql 文件时，即使成功导入，也会有部分字段内容不完整，导致前端页面渲染数据时报错）
- 确保 Maven 和 NPM 能够成功导入现版本依赖，请勿升级或降低依赖版本
- 数据库中默认用户名密码为`Admin`，`123456`，因为是个人博客，没打算做修改密码的页面，可在`com.nfeng.util.HashUtils`下的`main`方法手动生成密码存入数据库
- 注意修改`application-dev.properties`的配置信息
  - 注意修改`token.secretKey`，否则无法保证 token 安全性
  - `spring.mail.host`及`spring.mail.port`的默认配置为阿里云邮箱，其它邮箱服务商参考关键字`spring mail 服务器`（邮箱配置用于接收/发送评论提醒）
- 如需部署，注意将`/blog-view/src/plugins/axios.js`和`/blog-cms/src/util/request.js`中的`baseUrl`修改为你的后端 API 地址
- 大部分个性化配置可以在后台“站点设置”中修改，小部分由于考虑到首屏加载速度（如首页大图）需要修改前端源码



## 隐藏功能

- 在前台访问`/login`路径登录后，可以以博主身份（带有博主标识）回复评论，且不需要填写昵称和邮箱即可提交





# 秒杀

一个关于秒杀的故事 记录学习和工作点滴

学习了redis和rabbitmq一直没有很好地应用，秒杀业务可以使用redis预减库存、消息队列异步下单逐级消减对数据库的访问；mysql最大的并发量才1000，

所以瓶颈基本都是在数据库

因为是前端菜鸟所以使用bootstrap jq 和后端的thymeleaf 中间件用rabbitmq/redis/druid；

系统支持横向拓展，集群，优化缓存 异步下单 消峰 验证码框架也是用的数学验证最大强度的防止机器人；

自己封装的jedis更易使用 使用jedisTemplate主要是spring给了cache功能，这里直接自己封装的。

使用validation 校验

两次md5 加盐 加密
未完待续。

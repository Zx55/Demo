# MongoDB 快速教程

本文档仅适用于面向作业编程的快速学习。

## MongoDB简介

根据官网描述，MongoDB不是关系型数据库，但介于关系型数据库和非关系型数据库之间，更方便有使用关系型数据库的人学习和掌握。

## 安装部署

- 不关心的朋友可以不看，可以直接使用我们已经部署好的在线服务；基本方法还是下载安装包安装后启动服务。Windows用户可能会麻烦一些，macOS可以直接使用`brew install mongodb`来安装，Linux用户一般可以使用相应的包管理器。

- 我们已经在分配的华为云服务器上部署了MongoDB。由于没有设置用户名和密码，大家可以很方便的使用URL连接该MongoDB服务。比如，你要连接loheagn数据库，可以直接使用`mongodb://114.116.189.128:27017/loheagn`连接。

- 关于更多的连接MongoDB的示例请参见[MongoDB - 连接](https://www.runoob.com/mongodb/mongodb-connections.html)。

- 大家可以使用shell连接MongoDB，也可以使用GUI客户端Robo 3T（包含Windows版和macOS版）。

- **大家在连接线上的MongoDB服务进行编程练习时，请新建属于自己的数据库后再操作。**

## 层次结构

### 数据库 db

这一概念跟关系型数据库中的数据库相同。其中包含多个表，这些表在MongoDB中叫做集合（collection）。

### 集合 collection

对应关系型数据库中的table。其中包含多条记录，这些记录在MongoDB中叫做文档。

### 文档

- 相当于关系型数据库中的一条记录。每个文档都是一组键值对，格式很像json，存储类型是BSON（binary json）。比如，下面是就是一个文档的示例：
    ```json
    {"number": 1, "name": "loheagn"}
    ```

- 多条文档（有关联的记录，即一般都具有类似的数据结构）组合在一起形成一个集合，比如：
    ```json
    {"number": 2}
    {"number": 1, "name": "loheagn"}
    {"number": 3, "name": "lofdsfji", "is_completed": false}
    ```
### 主键

- MongoDB自动将`_id`字段设置为主键。`_id`是一个值类型为ObjectId的键值对。ObjectId是MongoDB根据时间戳、进程的PID等生成的。

- 例如，当我们向集合中插入文档`{"number": 2}`时，实际上将向集合中插入这样的记录：
  ```json
  {"_id" : ObjectId("5d5684334575cff42d834ec5"), "number": 2}
  ```

## 增删改查操作

由于springboot提供的MongoDB的starter包已经基本实现了对MongoDB的操作的对象化的包装，学不学MongoDB原生的对各个层级的数据结构的增删改查操作已经意义不大。想了解的同学可以直接去菜鸟教程看介绍，也是很简单的。

## SpringBoot中使用MongoDB

请参考[Spring Boot中快速操作Mongodb](https://juejin.im/post/5afb9de8518825426c690307)，这里面讲的非常详细，了解这些就够了。
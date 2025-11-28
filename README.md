# Leo’s Tech Blog

> 一个轻量级、全栈技术博客系统，用于展示 Java 后端架构能力与 Vue3 前端实践。项目从 0 到 1 独立开发，支持 Markdown 写作、JWT 认证、本地缓存优化，并可在 **2核2G 低配云服务器**上稳定运行。

[![License](https://img.shields.io/badge/license-Apache_2.0-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://openjdk.org/)
[![Vue](https://img.shields.io/badge/Vue-3-4FC08D.svg)](https://vuejs.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-6DB33F.svg)](https://spring.io/projects/spring-boot)

## ✨ 项目目标

- ✅ **练手核心技能**：巩固 Spring Boot、MyBatis-Plus、Vue3 等主流技术栈
- ✅ **展示架构能力**：分层设计、缓存优化、安全控制、Docker 部署
- ✅ **适配低配环境**：在2C2G的云服务器上高效运行
- ✅ **简历加分项目**：可作为“个人全栈项目”写入工作经历

---

## 🛠 技术栈

### 后端（Java）
| 类别       | 技术选型                    | 说明                   |
|----------|-------------------------|----------------------|
| 核心框架     | Spring Boot 3.5.8       | 基于 JDK 17，轻量高效       |
| 构建工具     | Maven                   | 多模块管理                |
| 数据库      | MySQL 8.0               | 本地部署，已调优             |
| ORM      | MyBatis-Plus 3.5.14     | 简化 CRUD，提升开发效率       |
| 缓存       | Caffeine                | 本地缓存，零外部依赖，节省内存      |
| 安全       | Spring Security + JWT   | 无状态认证，适配 RESTful API |
| Markdown | flexmark-java           | Java 原生 Markdown 解析  |
| 部署       | Docker + docker-compose | 容器化部署，资源隔离           |

### 前端（Vue3）
| 类别       | 技术选型                                      |
|----------|-------------------------------------------|
| 框架       | Vue 3（Composition API + `<script setup>`） |
| UI 组件库   | Element Plus                              |
| 构建工具     | Vite                                      |
| 路由       | Vue Router 4                              |
| HTTP 客户端 | Axios                                     |

### 运维 & 部署
- **服务器**：2核2G
- **Web 服务器**：Nginx（托管前端静态资源 + 反向代理 API）
- **监控**：`htop` + `docker stats`（手动观察资源使用）

> 💡 **为什么不使用 Redis / Kafka / Elasticsearch？**  
> 为适配 2G 内存环境，避免引入高开销中间件，坚持“够用即止”原则。

---

## 🗂 项目结构

```bash
Blog/
├── src/main/
│   ├── java/com/hcbxwy/blog/
│   │   ├── common/          # 公共模块
│   │   ├── config/          # 配置模块
│   │   ├── controller/      # 控制层
│   │   ├── entity/          # 实体类
│   │   ├── mapper/          # 数据访问层
│   │   ├── service/         # 业务逻辑层
│   │   │   └── impl/        # 业务逻辑实现
│   │   ├── BlogApplication.java  # 启动类
│   │   └── CodeGenerator.java    # 代码生成器
│   └── resources/
│       ├── application.yml       # 应用配置文件
│       ├── db/migration/         # 数据库迁移脚本
│       └── templates/            # 代码生成模板
├── pom.xml                  # Maven 配置文件
├── README.md                # 项目说明文档
└── LICENSE                  # 许可证文件
```
## 🚀 快速启动（本地开发）

### 后端
```bash
cd backend
mvn clean package -DskipTests
java -jar blog-main/target/*.jar
```
### 前端
```bash
cd frontend
npm install
npm run dev  # 访问 http://localhost:5173
```
### 生产部署
```bash
# 构建前端
cd frontend && npm run build

# 启动服务（自动拉起 MySQL + Java + Nginx）
docker-compose up -d
```
## 📅 版本规划
| 版本   | 状态     | 功能描述                             |
|------|--------|----------------------------------|
| v0.1 | 🚧 开发中 | 后端文章 CRUD + JWT 登录 + Caffeine 缓存 |
| v0.2 | ⏳ 计划中  | Vue3 前端：文章列表 + 详情页 + 后台管理        |
| v0.3 | ⏳ 计划中  | Docker 一键部署脚本 + Nginx 配置         |
| v1.0 | ⏳ 计划中  | 开源发布，支持评论、标签、RSS                 |

## 📝 为什么做这个项目？
- 过去多年聚焦企业级系统开发，缺乏可公开展示的个人项目
- 希望通过一个轻量但规范的全栈项目，巩固技术栈、提升简历竞争力
- 验证在资源受限环境下，如何通过架构设计保障系统稳定性
## 📜 License
Apache License 2.0 — 免费用于学习、商用、二次开发。

> 作者：Leo
> Github：https://github.com/hcbxwy/Blog
> 部署示例：www.hcbxwy.com

# SmartCoder 后端

SmartCoder 是一个智能编码助手，为编程人员和普通用户提供代码生成、代码注释和代码修改功能。用户可以通过简单的描述获取所需的代码，同时还能在我们的论坛上发布和接取编程任务。

## 技术栈

### 基本框架
- **Spring Boot**: 版本 3.1.4
- **Maven**: 用于项目构建和依赖管理

### 编程语言
- **Java**: 版本 17

### 数据库相关
- **MySQL**: 通过 `mysql-connector-j` 连接器
- **Spring Data JPA**
- **MyBatis**: 版本 3.5.10
- **MyBatis-Plus**: 版本 3.5.3.1

### Web 开发
- **Spring Web MVC**: 通过 `spring-boot-starter-web`

### 安全和认证
- **Spring Security**: 通过 `spring-boot-starter-security`
- **JSON Web Tokens (JWT)**: 通过 `jjwt` 库, 版本 0.9.0

### 测试
- **Spring Boot Test**: 通过 `spring-boot-starter-test`

### 其他库和工具
- **Project Lombok**: 简化代码，例如自动生成 getters 和 setters
- **JAXB (Java Architecture for XML Binding)**: 版本 2.3.0
- **Spring Boot DevTools**: 提供快速应用重启、LiveReload 和其他开发时功能

### 构建和运行
- **Spring Boot Maven Plugin**: 用于构建和运行 Spring Boot 应用

## 安装与配置

### 前提条件
- JDK 17
- MySQL 数据库
- Maven (推荐版本 3.6 或以上)

### 步骤

1. **克隆仓库**:
   使用以下命令克隆项目仓库到本地：
   ```bash
   git clone https://github.com/portfolio0318/smartCoder.git
   cd smartcoder
   ```

2. **配置数据库**:
   - 在 MySQL 中创建一个新的数据库和用户。
   - 更新 `src/main/resources/application.properties` 文件，设置正确的数据库连接信息，例如：
   spring.datasource.url=jdbc:mysql://localhost:3306/smartcoder
   spring.datasource.username=username
   spring.datasource.password=password


3. **构建项目**:
   使用 Maven 构建项目：

   mvn clean install


4. **运行项目**:
   使用以下命令运行项目：

   mvn spring-boot:run


5. **(可选) 配置额外的应用设置**:
   根据需要，你可以更新 `src/main/resources/application.properties` 文件，配置其他应用设置，例如服务器端口、日志级别等。

6. **访问应用**:
   在浏览器中输入 `http://localhost:9090` 来访问你的应用。

## API 文档

API 文档请参见 [smartCoderAPI.md](smartCoderAPI.md)
### 测试
运行以下命令以执行项目的测试：

mvn test


## 贡献

欢迎提交 Pull Request 或提出 Issue。请确保您的代码通过了所有的测试。

# SmartCoder Backend

SmartCoder is an intelligent coding assistant, offering code generation, code annotation, and code modification functions for programmers and ordinary users. Users can obtain the desired code through simple descriptions and can also post and accept programming tasks on our forum.

## **Technology Stack**

### **Basic Framework**

- **Spring Boot**: Version 3.1.4
- **Maven**: project building and dependency management

### **Programming Language**

- **Java**: version 17

### **Database Related**

- **MySQL**: Connected via `mysql-connector-j` 
- **Spring Data JPA**
- **MyBatis**: Version 3.5.10
- **MyBatis-Plus**: Version 3.5.3.1

### **Web Development**

- **Spring Web MVC**: Via `spring-boot-starter-web`

### **Security and Authentication**

- **Spring Security**: Via `spring-boot-starter-security`
- **JSON Web Tokens (JWT)**: Via `jjwt` library, Version 0.9.0

### Test
- **Spring Boot Test**: Via `spring-boot-starter-test`

### **Other Libraries and Tools**

- **Project Lombok**: Simplifies code, e.g., automatically generating getters and setters
- **JAXB (Java Architecture for XML Binding)**: Version 2.3.0
- **Spring Boot DevTools**: Provides quick application restarts, LiveReload, and other development-time-features

### **Build and Run**

- **Spring Boot Maven Plugin**: For building and running the Spring Boot application

## **Installation and Configuration**

### **Prerequisites**

- JDK 17
- MySQL Database
- Maven (recommended version 3.6 or higher)

### **Steps**

1. **Clone the repository**:

   Use the following command to clone the project repository locally:

   ```bash
   git clone https://github.com/portfolio0318/smartCoder.git
   cd smartcoder
   ```

2. **Configure the database**:

   - Create a new database and user in MySQL.

   - Update `src/main/resources/application.properties` files with the correct database connection information, e.g.:

     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/smartcoder

     spring.datasource.username=username

     spring.datasource.password=password
     ```

     ​


3. **Build the project**:

   Build the project using Maven:

   ``mvn clean install``


4. **Run the project**:

   Use the following command to run the project:

   ``mvn spring-boot:run``


5. ***(Optional) Configure additional application settings*:**

    You can update the``src/main/resources/application.properties``   file to configure other application settings, such as server port, logging level, etc.

    

6. **Access the application**:

   Enter [http://localhost:9090](http://localhost:9090/) in your browser to access your application.

## API **Documentation**

Please refer to smartCoderAPI.md for API documentation.

### Test
Run the following command to execute the project's tests:

``mvn test``

**Contributions**

1. Project Contributors: **Shicong Hu, *Wentian Tang**, **Chengxi Li, *Xiaorong Huang, *Ronghui Shao**

Feel free to submit Pull Requests or raise Issues. Please make sure your code passes all tests.
---
title: SmartCoder v1.0.0
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
code_clipboard: true
highlight_theme: darkula
headingLevel: 2
generator: "@tarslib/widdershins v4.0.17"

---

# SmartCoder

> v1.0.0

Base URLs:

# Authentication

# accountManagement

## POST Login

POST /users/auth/login

> Body 请求参数

```json
{
  "username": "john",
  "password": "newPassword456"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|object| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "Login successfully!",
  "data": {
    "id": 1,
    "username": "proguser123",
    "password": "$2a$10$YRMxlJZVDftEC8uem.FQnuVJn5pI2Ij7BIR8lbWv8D6zyTXTwJh6O",
    "email": "proguser123@example.com"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» msg|string|true|none||none|
|» total|integer|true|none||none|
|» data|object|true|none||none|
|»» id|integer|true|none||none|
|»» username|string|true|none||none|
|»» password|string|true|none||none|
|»» email|string|true|none||none|
|» message|string|true|none||none|

## POST register

POST /users/auth/register

> Body 请求参数

```json
{
  "username": "proguser123",
  "password": "securepassword",
  "email": "proguser123@example.com",
  "userType": "PROGRAMMER"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|object| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "msg": "successful",
  "total": 0,
  "data": {
    "id": 1,
    "username": "proguser123",
    "password": "$2a$10$i4G6TfSoFpsxmhpcOqhju.E4VkQqVnUAH3xB/j.0jw/7yu21eB61.",
    "email": "proguser123@example.com",
    "userType": "PROGRAMMER"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» msg|string|true|none||none|
|» total|integer|true|none||none|
|» data|object|true|none||none|
|»» id|integer|true|none||none|
|»» username|string|true|none||none|
|»» password|string|true|none||none|
|»» email|string|true|none||none|
|»» userType|string|true|none||none|

## PUT modifyPassword

PUT /users/change-password

> Body 请求参数

```json
{
  "username": "john",
  "oldPassword": "password123",
  "newPassword": "newPassword456"
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|object| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "msg": "successful",
  "total": 0,
  "data": "Password updated for user: john"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» msg|string|true|none||none|
|» total|integer|true|none||none|
|» data|string|true|none||none|

## GET GetByID

GET /users/1

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "msg": "string",
  "total": 0,
  "data": {
    "id": 0,
    "username": "string",
    "password": "string",
    "email": "string",
    "userType": "string"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» msg|string|true|none||none|
|» total|integer|true|none||none|
|» data|object|true|none||none|
|»» id|integer|true|none||none|
|»» username|string|true|none||none|
|»» password|string|true|none||none|
|»» email|string|true|none||none|
|»» userType|string|true|none||none|

# forum

## POST addAnswer

POST /answer/auth/add

程序员发布答案

> Body 请求参数

```json
{
  "answerId": 0,
  "taskId": 0,
  "userId": 0,
  "content": "string",
  "accepted": 0
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|body|body|object| 否 |none|
|» answerId|body|integer| 是 |none|
|» taskId|body|integer| 是 |none|
|» userId|body|integer| 是 |none|
|» content|body|string| 是 |none|
|» accepted|body|integer| 是 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "in ea",
  "data": 1
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||200|
|» message|string|true|none|成功|success|
|» data|object¦null|false|none||none|

## GET getAskTaskList()

GET /task/auth/ask/list

返回用户未被解决的任务(前十个字符, 输入参数必须为必填，任务内容不少于15个字符)

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": [
    {
      "taskId": 2,
      "userId": 1,
      "content": "sdadasdasd...",
      "finished": 0,
      "codeType": "python"
    },
    {
      "taskId": 3,
      "userId": 1,
      "content": "dassagfdfd...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 4,
      "userId": 1,
      "content": "ghfhfghada...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 5,
      "userId": 1,
      "content": "ghfghgfhsa...",
      "finished": 0,
      "codeType": null
    },
    {
      "taskId": 6,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 9,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 10,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none|200|200|
|» message|string|true|none|success|success|
|» data|object|true|none||none|
|»» taskId|integer|true|none||none|
|»» userId|integer|true|none||none|
|»» content|string|true|none||none|
|»» finished|integer|true|none||none|
|»» codeType|string|true|none||none|
|»» task|object|true|none||none|
|»»» taskId|integer|true|none||none|
|»»» userId|integer|true|none||none|
|»»» content|string|true|none||none|
|»»» finished|integer|true|none||none|
|»»» codeType|string|true|none||none|

## POST adoptAnswer

POST /answer/auth/adopt

用户采纳问题

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|answerId|query|integer| 否 |none|
|status |query|integer| 否 |0：取消采纳 1：采纳|
|taskId|query|integer| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "sucess",
  "data": 1
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none|200|200|
|» message|string|true|none|sucess|sucess|
|» data|object|true|none||none|

## POST askForHelp

POST /task/auth/ask

用户向程序员请求帮助

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|taskId|query|integer| 否 |none|
|userId|query|integer| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none|200|200|
|» message|string|true|none|sucess|sucess|
|» data|object¦null|true|none|1|none|

## GET getTaskDetail

GET /task/auth/detail

返回任务详情

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|taskId|query|integer| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": {
    "taskId": 65,
    "userId": 47,
    "content": "id nulla dolor consequat ut",
    "finished": 0,
    "codeType": "java"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|
|»» taskId|integer|true|none||none|
|»» userId|integer|true|none||none|
|»» content|string|true|none||none|
|»» finished|integer|true|none||none|
|»» codeType|string|true|none||none|

## POST addTask

POST /task/auth/add

添加任务(默认已经完成的任务)

> Body 请求参数

```json
{
  "task": {
    "taskId": 65,
    "userId": 47,
    "content": "id nulla dolor consequat ut",
    "finished": 63,
    "codeType": "java"
  }
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|Task|query|string| 否 |none|
|body|body|object| 否 |none|
|» taskId|body|integer| 是 |none|
|» userId|body|integer| 是 |none|
|» content|body|string| 是 |none|
|» finished|body|integer| 是 |none|
|» codeType|body|string| 是 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": null
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|

## GET getMyTaskList

GET /task/auth/my/list

获取用户所有任务前十个字符（包括已解决和未解决的）

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|userId|query|integer| 是 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": [
    {
      "taskId": 1,
      "userId": 1,
      "content": "sdasdadads...",
      "finished": 1,
      "codeType": "json"
    },
    {
      "taskId": 2,
      "userId": 1,
      "content": "sdadasdasd...",
      "finished": 0,
      "codeType": "python"
    },
    {
      "taskId": 3,
      "userId": 1,
      "content": "dassagfdfd...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 4,
      "userId": 1,
      "content": "ghfhfghada...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 5,
      "userId": 1,
      "content": "ghfghgfhsa...",
      "finished": 0,
      "codeType": null
    },
    {
      "taskId": 6,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 9,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 10,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|
|»» taskId|integer|true|none||none|
|»» userId|integer|true|none||none|
|»» content|string|true|none||none|
|»» finished|integer|true|none||none|
|»» codeType|string|true|none||none|
|»» task|object|true|none||none|
|»»» taskId|integer|true|none||none|
|»»» userId|integer|true|none||none|
|»»» content|string|true|none||none|
|»»» finished|integer|true|none||none|
|»»» codeType|string|true|none||none|

## GET getMyAskTaskList

GET /task/auth/my/ask/list

获取用户所有未解决的任务的（前十个字符）

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|userId|query|integer| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": [
    {
      "taskId": 2,
      "userId": 1,
      "content": "sdadasdasd...",
      "finished": 0,
      "codeType": "python"
    },
    {
      "taskId": 3,
      "userId": 1,
      "content": "dassagfdfd...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 4,
      "userId": 1,
      "content": "ghfhfghada...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 5,
      "userId": 1,
      "content": "ghfghgfhsa...",
      "finished": 0,
      "codeType": null
    },
    {
      "taskId": 6,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 9,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    },
    {
      "taskId": 10,
      "userId": 1,
      "content": "id nulla d...",
      "finished": 0,
      "codeType": "java"
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|
|»» taskId|integer|true|none||none|
|»» userId|integer|true|none||none|
|»» content|string|true|none||none|
|»» finished|integer|true|none||none|
|»» codeType|string|true|none||none|

## GET getMyAcceptTaskList

GET /task/auth/my/accept/list

返回用户已完成task的信息

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|userId|query|integer| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": [
    {
      "taskId": 1,
      "userId": 1,
      "content": "sdasdadads...",
      "finished": 1,
      "codeType": "json"
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|
|»» taskId|integer|true|none||none|
|»» userId|integer|true|none||none|
|»» content|string|true|none||none|
|»» finished|integer|true|none||none|
|»» codeType|string|true|none||none|

## GET getTaskAnswerDetail

GET /task/auth/task/detail

返回用户所有任务和答案详情

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|taskId|query|integer| 否 |none|

> 返回示例

> 成功

```json
{
  "code": 200,
  "message": "success",
  "data": {
    "task": {
      "taskId": 11,
      "userId": null,
      "content": null,
      "finished": 0,
      "codeType": null
    },
    "answerList": [
      {
        "answerId": 1,
        "taskId": 11,
        "userId": 13,
        "content": "string",
        "accepted": 1
      },
      {
        "answerId": 2,
        "taskId": 11,
        "userId": 13,
        "content": "string",
        "accepted": 0
      }
    ]
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|
|»» task|object|true|none||none|
|»»» taskId|integer|true|none||none|
|»»» userId|null|true|none||none|
|»»» content|null|true|none||none|
|»»» finished|integer|true|none||none|
|»»» codeType|null|true|none||none|
|»» answerList|[object]|true|none||none|
|»»» answerId|integer|true|none||none|
|»»» taskId|integer|true|none||none|
|»»» userId|integer|true|none||none|
|»»» content|string|true|none||none|
|»»» accepted|integer|true|none||none|

# codeGeneration

## POST produceCode

POST /createItem

请将host地址调至模型地址，之后直接使用接口进行调用即可

> Body 请求参数

```json
{
  "lang": "string",
  "prompt": "string",
  "seed": 0,
  "max_length": 0,
  "top_p": 0,
  "temperature": 0,
  "top_k": 0
}
```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|Content-Type|header|string| 否 |包体类型，此header固定|
|body|body|object| 否 |none|
|» lang|body|string| 是 |从'Python'，‘Java’，‘JavaScript’三个数据值中选择，|
|» prompt|body|string| 是 |客户需求，请前端规划成自然语言形式|
|» seed|body|integer¦null| 否 |默认为2000|
|» max_length|body|integer¦null| 否 |最长返回值，默认为128|
|» top_p|body|integer¦null| 否 |默认为0.95|
|» temperature|body|integer¦null| 否 |默认为0.2|
|» top_k|body|integer¦null| 否 |默认为0|

> 返回示例

> 200 Response

```json
{
  "response": "string",
  "lang": "string",
  "status": 0,
  "time": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» response|string|true|none||LLM的具体答复|
|» lang|string|true|none||编程语言种类|
|» status|integer|true|none||none|
|» time|string|true|none||解析时间|

# 数据模型


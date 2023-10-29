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

#SmartCoder

> v1.0.0

Base URLs:

#Authentication

#accountManagement

## POST Login

POST /users/auth/login

> Body Request parameters

```json
{
   "username": "john",
   "password": "newPassword456"
}
```

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| No |none|
> Return example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

> Body request parameters

```json
{
   "username": "proguser123",
   "password": "securepassword",
   "email": "proguser123@example.com",
   "userType": "PROGRAMMER"
}
```

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| No |none|

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

> Body request parameters

```json
{
   "username": "john",
   "oldPassword": "password123",
   "newPassword": "newPassword456"
}
```

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| No |none|

> Return to example

> Success

```json
{
   "code": 200,
   "msg": "successful",
   "total": 0,
   "data": "Password updated for user: john"
}
```

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» msg|string|true|none||none|
|» total|integer|true|none||none|
|» data|string|true|none||none|

##GET GetByID

GET /users/1

> Return to example

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

#forum

## POST addAnswer

POST /answer/auth/add

Programmer posts answer

> Body request parameters

```json
{
   "answerId": 0,
   "taskId": 0,
   "userId": 0,
   "content": "string",
   "accepted": 0
}
```

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| No |none|
|» answerId|body|integer| is |none|
|» taskId|body|integer| is |none|
|» userId|body|integer| is |none|
|» content|body|string| is |none|
|» accepted|body|integer| is |none|

> Return to example

> Success

```json
{
   "code": 200,
   "message": "in ea",
   "data": 1
}
```

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
|---|---|---|---|---|---|
|» code|integer|true|none||200|
|» message|string|true|none|success|
|» data|object¦null|false|none||none|

## GET getAskTaskList()

GET /task/auth/ask/list

Return the user's unsolved tasks (the first ten characters, input parameters must be required, and the task content must be no less than 15 characters)

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

User adoption issues

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|answerId|query|integer| No |none|
|status |query|integer| No |0: Cancel adoption 1: Adopt|
|taskId|query|integer| No |none|

> Return to example

> Success

```json
{
   "code": 200,
   "message": "sucess",
   "data": 1
}
```

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
|---|---|---|---|---|---|
|» code|integer|true|none|200|200|
|» message|string|true|none|sucess|sucess|
|» data|object|true|none||none|

## POST askForHelp

POST /task/auth/ask

User asks programmer for help

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|taskId|query|integer| No |none|
|userId|query|integer| No |none|

> Return to example

> 200 Response

```json
{
   "code": 0,
   "message": "string",
   "data": {}
}
```

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
|---|---|---|---|---|---|
|» code|integer|true|none|200|200|
|» message|string|true|none|sucess|sucess|
|» data|object¦null|true|none|1|none|

## GET getTaskDetail

GET /task/auth/detail

Return to task details

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|taskId|query|integer| No |none|

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

Add tasks (completed tasks by default)

> Body request parameters

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

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|Task|query|string| No |none|
|body|body|object| No |none|
|» taskId|body|integer| is |none|
|» userId|body|integer| is |none|
|» content|body|string| is |none|
|» finished|body|integer| is |none|
|» codeType|body|string| is |none|

> Return to example

> Success

```json
{
   "code": 200,
   "message": "success",
   "data": null
}
```

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» message|string|true|none||none|
|» data|object|true|none||none|

## GET getMyTaskList

GET /task/auth/my/list

Get the first ten characters of all tasks for the user (including resolved and unresolved)

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|userId|query|integer| is |none|

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

Get the (first ten characters) of all unsolved tasks for the user

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|userId|query|integer| No |none|

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

Return information that the user has completed the task

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|userId|query|integer| No |none|

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

Returns all task and answer details for the user

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|taskId|query|integer| No |none|

> Return to example

> Success

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

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
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

#codeGeneration

## POST produceCode

POST /createItem

Please adjust the host address to the model address, and then directly use the interface to call it.

> Body request parameters

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

### Request parameters

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|Content-Type|header|string| No |Package body type, this header is fixed|
|body|body|object| No |none|
|» lang|body|string| Yes |Select from three data values of 'Python', 'Java', 'JavaScript', |
|» prompt|body|string| Yes |Customer needs, please plan the front-end into natural language form|
|» seed|body|integer¦null| No |Default is 2000|
|» max_length|body|integer¦null| No |The longest return value, the default is 128|
|» top_p|body|integer¦null| No |Default is 0.95|
|» temperature|body|integer¦null| No |Default is 0.2|
|» top_k|body|integer¦null| No |Default is 0|

> Return to example

> 200 Response

```json
{
   "response": "string",
   "lang": "string",
   "status": 0,
   "time": "string"
}
```

### Return results

|Status code|Status code meaning|Description|Data model|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|Inline|

### Return data structure

Status code **200**

|Name|Type|Required|Constraint|Chinese name|Description|
|---|---|---|---|---|---|
|» response|string|true|none||Specific reply from LLM|
|» lang|string|true|none||Programming language type|
|» status|integer|true|none||none|
|» time|string|true|none||Parse time|

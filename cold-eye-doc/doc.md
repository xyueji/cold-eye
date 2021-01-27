<a name="top"></a>
# 冰眼冷链系统 v1.0.0

冰眼冷链系统文档

 - [UserController](#UserController)
   - [用户信息](#用户信息)
   - [登出](#登出)
   - [登录](#登录)
   - [获取token](#获取token)

___


# <a name='UserController'></a> UserController

## <a name='用户信息'></a> 用户信息
[Back to top](#top)

<p>用户信息</p>

```
POST sys/user/info
```

### Parameters examples
`json` - 请求示例:

```json
{

}
```

### Success response example

#### Success response example - `成功响应:`

```json
HTTP/1.1 200 OK
{
  "code":"0",
  "msg":"success",
  "data":{

  }
}
```

## <a name='登出'></a> 登出
[Back to top](#top)

<p>登出</p>

```
POST sys/user/logout
```

### Headers - `Header`

| Name    | Type      | Description                          |
|---------|-----------|--------------------------------------|
| name | `String` |  |

### Parameters examples
`json` - 请求示例:

```json
{

}
```

### Success response example

#### Success response example - `成功响应:`

```json
HTTP/1.1 200 OK
{
  "code":"0",
  "msg":"success",
  "data":{

  }
}
```

## <a name='登录'></a> 登录
[Back to top](#top)

<p>登录</p>

```
POST sys/user/login
```

### Parameters - `Parameter`

| Name     | Type       | Description                           |
|----------|------------|---------------------------------------|
| username | `String` | <p>用户名</p> |
| password | `String` | <p>密码</p> |

### Parameters examples
`json` - 请求示例:

```json
{
 "username": "admin",
 "password": "admin123"
}
```

### Success response example

#### Success response example - `成功响应:`

```json
HTTP/1.1 200 OK
{
  "code":"0",
  "msg":"success",
  "data":{

  }
}
```

## <a name='获取token'></a> 获取token
[Back to top](#top)

<p>获取token</p>

```
POST sys/user/getToken
```

### Headers - `Header`

| Name    | Type      | Description                          |
|---------|-----------|--------------------------------------|
| token | `String` |  |

### Parameters examples
`json` - 请求示例:

```json
{

}
```

### Success response example

#### Success response example - `成功响应:`

```json
HTTP/1.1 200 OK
{
  "code":"0",
  "msg":"success",
  "data":{

  }
}
```

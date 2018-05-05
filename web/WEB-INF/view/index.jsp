<%--
  Created by IntelliJ IDEA.
  User: YanoHao
  Date: 2018/4/26
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>你好SpringMVC</title>
  </head>
  <body>
  Hello！${msg}
  <form action="login.do" method="post">
    <h1><span>测试参数传递到普通参数(url:.../login.do):（传递结果：用户名：${username} 密码：${password}）</span></h1>
    用户名：<input name="username"/><br>
    密码：<input name="password"/>
    <input type="submit" value="登录"/>
  </form>

  <form action="login.do" method="post">
    <h1><span>测试参数传递到pojo(url:.../login.do):（传递结果：用户名：${username} 密码：${password}）</span></h1>
    用户名：<input name="username"/><br>
    密码：<input name="password"/>
    <input type="submit" value="登录"/>
  </form>

  <form action="login.do" method="post">
    <h1><span>测试参数传递到普通参数名称不一致使用@RequestParam解决(url:.../login.do):（传递结果：用户名：${username} 密码：${password}）</span></h1>
    用户名：<input name="name"/><br>
    密码：<input name="pwd"/>
    <input type="submit" value="登录"/>
  </form>


  <form action="date.do" method="post">
    <h1><span>请求参数为日期字符串转化为日期类，需要自定义参数绑定实现(url:.../date.do):（传递结果：用户名：${username} 密码：${password}）</span></h1>
    日期：<input name="date" type="date"/>
    <input type="submit" value="提交"/>
  </form>

  <form action="arrayParameter.do" method="post">
    <h1><span style="color:red">高级参数绑定之数组类型的绑定(url:.../arrayParameter.do):（传递结果：${result}）</span></h1>
    数据1：<input name="data" type="checkbox" value="数据1"/>
    数据2：<input name="data" type="checkbox" value="数据2"/>
    数据3：<input name="data" type="checkbox" value="数据3"/>
    数据4：<input name="data" type="checkbox" value="数据4"/>
    数据5：<input name="data" type="checkbox" value="数据5"/>
    <input type="submit" value="提交"/>
  </form>

  <form action="listParameter.do" method="post">
    <h1><span style="color:red">高级参数绑定之List类型的绑定(url:.../listParameter.do):（传递结果：${result}）</span></h1>
    用户1：<input name="datas[0].username" type="text" value="数据1"/>
    用户1：<input name="datas[0].password" type="text" value="数据2"/>
    用户1：<input name="datas[0].email" type="text" value="数据3"/>
    用户2：<input name="datas[1].username" type="text" value="数据4"/>
    用户2：<input name="datas[1].password" type="text" value="数据5"/>
    用户2：<input name="datas[1].email" type="text" value="数据6"/>
    用户3：<input name="datas[2].username" type="text" value="数据7"/>
    用户3：<input name="datas[2].password" type="text" value="数据8"/>
    用户3：<input name="datas[2].email" type="text" value="数据9"/>
    <input type="submit" value="提交"/>
  </form>

  <form action="login1.do" method="post">
    <h1><span>测试多个请求URL都能映射到一个方法上(url:.../login1.do):（传递结果：用户名：${name}）</span></h1>
    测试：<input name="name" type="text"/>
    <input type="submit" value="提交"/>
  </form>
  <form action="login2.do" method="post">
    <h1><span>测试多个请求URL都能映射到一个方法上(url:.../login2.do):（传递结果：用户名：${name}）</span></h1>
    测试：<input name="name" type="text"/>
    <input type="submit" value="提交"/>
  </form>

  <form action="method.do" method="get">
    <h1><span>测试限定请求方法(url:.../method.do):（传递结果：用户名：${method}）</span></h1>
    测试：<input name="method" type="text" value="get请求"/>
    <input type="submit" value="提交"/>
  </form>

  <form action="method.do" method="post">
    <h1><span>测试限定请求方法(url:.../method.do):（传递结果：用户名：${method}）</span></h1>
    测试：<input name="method" type="text" value="post请求"/>
    <input type="submit" value="提交"/>
  </form>




  </body>
</html>

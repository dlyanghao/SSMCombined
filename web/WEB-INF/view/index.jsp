<%--
  Created by IntelliJ IDEA.
  User: YanoHao
  Date: 2018/4/26
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
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


  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: pzy
  Date: 2019/3/31
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="house/findAll">

</form>
<h3>根据id查询房产</h3>

<form action="house/findById" method="post">
    请输入查询ID:<input type="text" name="id"><br/>
    <input type="submit" value="查询">
</form>

<h3>查询所有房产信息</h3>
<a href="house/findAll">点击查询</a>

<h3>添加房产</h3>

<form action="house/saveHouse" method="post">
    房产名称：<input type="text" name="housename"/><br/>
    房产区域：<input type="text" name="district"/><br/>
    房产价格：<input type="text" name="price"/><br/>
    <input type="submit" value="保存"><br/>
</form>

<h3>更新房产价格</h3>

<form action="house/updateHouse" method="post">
    房产名称：<input type="text" name="housename"/><br/>
    房产价格：<input type="text" name="price"/><br/>
    <input type="submit" value="确认修改"><br/>
</form>
</body>
</html>

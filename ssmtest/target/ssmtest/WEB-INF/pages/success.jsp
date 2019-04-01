<%--
  Created by IntelliJ IDEA.
  User: pzy
  Date: 2019/3/31
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询成功</h3>

    <c:forEach items="${houseList}" var="house">
        <%--${house}<br/>--%>
        <br/>
        <tr>
            <td>${house.id}</td>
            <td> ${house.housename} </td> 
            <td>${house.district}</td>
            <td>${house.price}</td>
        </tr> 
    </c:forEach>
</body>
</html>

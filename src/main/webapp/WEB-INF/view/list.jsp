<%--
  Created by IntelliJ IDEA.
  User: huangzhitao
  Date: 2020/6/18
  Time: 2:29 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${test}--%>
<div>
    <a href="${pageContext.request.contextPath}/user/insert">新增学生</a>
</div>


<table border="1px">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>地址</td>
        <td>生日</td>
        <td>编辑</td>

    </tr>
<c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.address}</td>
            <td>${user.birth}</td>
            <td>
                <a href="${pageContext.request.contextPath}/user/edit?id=${user.id}">编辑</a>
                <a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">删除</a>
            </td>
        </tr>
</c:forEach>

    </table>
</body>
</html>

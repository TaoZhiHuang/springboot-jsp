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
<table border="1px">

    <form action="/user/insertUser" method="post">
         <input id="id" name="id" type="hidden" ></br>
       name:    <input id="name" name="name" type="text" ></br>
       address: <input id="address" name="address" type="text" ></br>
       生日：    <input id="birth" name="birth" type="date" ></br>
        <input type="submit" value="保存">
    </form>




    </table>
</body>
</html>

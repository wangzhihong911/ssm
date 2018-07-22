<%--
  Created by IntelliJ IDEA.
  User: wangz
  Date: 2018/7/22 0022
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>我是首页</title>
</head>
<body>
1111111111111111112222222222222111111111<br/>
     <c:forEach items="${list }"  var="li">
         ${li.name}||${li.id} <br/>
     </c:forEach>
</body>
</html>

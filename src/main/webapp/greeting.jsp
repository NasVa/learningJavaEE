<%--
  Created by IntelliJ IDEA.
  User: Anastasiya
  Date: 18.11.2022
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>
        <%@ page import="somePackage.someClass"%>
        <%
            java.util.Date now = new java.util.Date();
            String str = someClass.getSomeString() + now.toString();
        %>
        <% String name = request.getParameter("myname");%>
        <%= str + ".\n" + name + ", hey you"%>
    </p>
</body>
</html>

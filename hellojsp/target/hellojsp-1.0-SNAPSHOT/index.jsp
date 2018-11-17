<%--
  Created by IntelliJ IDEA.
  User: Przemek
  Date: 13.10.2018
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, JSP</title>
</head>
<body>
    <h1>Hello, JSP</h1>
<%
    for (int i = 0; i <10 ; i++) {
        out.print("Hello ");

    }
out.print("Hello there");

%>

</body>
</html>

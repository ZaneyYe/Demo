<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html lang="en">
    <head>
        <title>首页</title>
        <meta charset="UTF-8">
    </head>

    <body>
        <h1>Hello</h1>
        <h2><%=request.getAttribute("name") %></h2>
        <h2>${shit}</h2>
    </body>
</html>
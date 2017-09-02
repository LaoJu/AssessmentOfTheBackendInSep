<%@ page import="java.util.jar.Attributes" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/9/1
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>学号</th>
        <th>专业</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><%=request.getAttribute("NAME") %></td>
        <td><%=request.getAttribute("STDAGE")%></td>
        <td><%=request.getAttribute("STDNUMBER")%></td>
        <td><%=request.getAttribute("STDMAJOR") %></td>
    </tr>
    </tbody>
</table>
</body>
</html>

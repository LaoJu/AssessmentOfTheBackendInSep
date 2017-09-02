<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/23
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

   // out.println("<SCRIPT LANGUAGE='JavaScript'>alert('用户名或密码不正确！');location.href='login.jsp';</SCRIPT>");
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <script>
        function check() {
            var myform = document.getElementById("myform");
            for(var i=0;i<myform.length;i++){
                if(myform.elements[i].value==""){
                    alert(myform.elements[i].title+"不能为空！");
                    myform.elements[i].focus();
                    return;
                }
            }
            myform.submit();

        }
    </script>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>系统登录</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        form {
            width: 400px;
            height: 240px;
            border: 1px solid #ccc;
            position: absolute;
            top: 50%;
            left: 50%;
            margin-top: -120px;
            margin-left: -200px;
            text-align: center;
        }
        h2 {
            position: absolute;
            width: 120px;
            height: 40px;
            line-height: 40px;
            top: -20px;
            left: 30px;
            background-color: white;
        }
        input, select {
            display: block;
            border-radius: 5px;
            background-color: white;
            border: 1px solid #ccc;
            margin: 30px 25px;
            height: 35px;
            font-size: 18px;
            text-indent: 1em;
            width: 350px;
        }
        button {
            display: block;
            width: 150px;
            text-align: center;
            height: 40px;
            line-height: 40px;
            color: white;
            background-color: rgb(54,133,250);
            font-size: 18px;
            border: 0;
            border-radius: 5px;
            margin: 0 auto;
        }
    </style>
</head>

<body>
<form action="login" method="post" id="myform">
    <h2>欢迎登录</h2>
    <input type="text" name="username" title="用户名" placeholder="用户名" />
    <input type="password" name="password" title="密码" placeholder="用户密码" />
    <button type="button" value="提交" onclick="check()">确认登录</button>
</form>

</body>
</html>

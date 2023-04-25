<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<h3>${Header}</h3>

<hr>
<h1 style="color:green">${msg}</h1>
<h1>Welcome ${user.userName}</h1>
<h1>Your email is ${user.email} and password is ${user.userPassword}</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>Welcome to home page</h1>
<h1>This is called by home controller</h1>
<%
   String name= (String) request.getAttribute("name");
   Integer id=(Integer) request.getAttribute("id");
   List<String> friends=(List<String>) request.getAttribute("list");
%>
<h1>Name is  <%=name%></h1>
<h2>Id is <%=id%></h2>
<%
for(String s:friends){
%>
<h1><%=s%></h1>
<%
}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.*"%>
<%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h1>Welcome to help page</h1>
<%-- <%
String name=(String) request.getAttribute("name");
List<String> names=(List<String>) request.getAttribute("place");
%> --%>
<h1>Name is: ${name}</h1>
<%-- <%
for(String s:names)
{
%>
<h1><%=s %></h1>
<%
}
%> --%>
<c:forEach var="item" items="${place}">
<h1>${item}</h1>
</c:forEach>
</body>
</html>
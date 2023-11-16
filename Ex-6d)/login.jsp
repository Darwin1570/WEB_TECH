<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<title>Login Result</title>
</head>
<body>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
if (username != null && password != null && username.equals("user") &&
password.equals("password")) {
%>
<h1>Login Successful</h1>
<p>Welcome, <%= username %>!</p>
<%
} else {
%>
<h1>Login Failed</h1>
<p>Invalid username or password.</p>
<%
}
%>
</body>
</html>
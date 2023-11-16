<!DOCTYPE html>
<html>
<head>
<title>Welcome Page</title>
</head>
<body>
<h1>Welcome to the Session Management Example</h1>
<%
// Access session attributes set in SessionServlet
String sessionId = (String) session.getAttribute("sessionId");
String username = (String) session.getAttribute("username");
%>
<p>Your Session ID: <%= sessionId %></p>
<p>Hello, <%= username %>!</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome!...</h1>
	<%String name=(String)request.getAttribute("uname");
	out.print("Name:" + name); %>
	<br>
	
	<%Object js=request.getAttribute("jsonDetails");
	  out.print("Obj"+js);%>
	
	<%String email=(String)request.getAttribute("email");
	out.print("Email:" + email); %>
	
</body>
</html>
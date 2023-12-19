<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("Scriplet Tag");

		out.println("Only local variables and implicit objects are allowed.");
				
		//implicit objects
		out.println("Hello!");
		
		request.setAttribute("msg", 100);
		out.println(request.getAttribute("msg"));
		
		//local variables
		int x = 250;
		out.print(x);
	%>
</body>
</html>
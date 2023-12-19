<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%!
		//Declaration Tag
		
		//Only Access Specifiers and Methods are allowed.
		
		public int x = 90;
		public static int y = 100;
		
		public int test(){
			return 100;
		}
	%>
	
	
	<%=x	%>
	<%=y	%>
	<%=test()	%>
	
</body>
</html>
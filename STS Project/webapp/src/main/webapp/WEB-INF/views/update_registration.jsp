<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Registration</h2>
	<form action="updateReg" method="post">
		<pre>
			First Name <input type="text" name="firstName" value="${registration.firstName}"/>
			Last Name <input type="text" name="lastName" value="${registration.lastName}"/>
			Email <input type="text" name="email" value="${registration.email}"/>
			Mobile <input type="text" name="mobile" value="${registration.mobile}"/>
			<input type="submit" value="Update"/>
		</pre>
	</form>
	${msg}
</body>
</html>
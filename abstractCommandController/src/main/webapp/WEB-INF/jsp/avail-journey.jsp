<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: verdana;font-size: 30px;">
	
	<form action="<%=request.getContextPath( )%>/search-journey.htm" method="post">
		source: <input type="text" name="source"><br>
		destination: <input type="text" name="destination"><br>
		journey date: <input type="text" name="journeydt"><br>
		<button type="submit" value="search">search</button>
	</form>
</body>
</html>
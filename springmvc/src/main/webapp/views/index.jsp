<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to anand
<form action="addAlien">
Enter id : <input type="text" name="aid"><br>
Enter name : <input type="text" name="aname"><br>
<input type="submit">
</form>
<hr>
<form action="getAlien" method="get">
Enter id : <input type="text" name="aid"><br>
<input type="submit">
</form>
</body>
</html>
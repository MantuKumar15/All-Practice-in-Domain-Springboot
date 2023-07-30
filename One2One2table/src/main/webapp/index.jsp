<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/into">
Laptop Id: <input type="text" name="lid"><br>
Laptop name<input type="text" name="lname"><br>
Company Name: <input type="text" name="company"><br>
Processor id: <input type="text" name="pro_id"><br>
Processor name: <input type="text" name="pro_name"><br>
<input type="submit" name="submit"><br>

</form>
<form action="/find">
<br>
<b>find by id</b>
<input type="text" name="lid">
<input type="submit" value="search">

</form>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
form{
background-color: skyblue;
width: 400px;
height: 250px;
padding: 10px;
border-style: solid;
border-color: blue;
align: center;
}

form-center{
display: flex;
justify-content: center;
}
</style>

</head>
<body><center>
<div class="form-center">
<form action="/login" method="post">
<c:if test="${not empty error }">
<div style="color: red;"><h4>${error }</h4></div>
</c:if>
<div><h1> Login Form </h1></div>
<div>User Id: <input type="text" name="uid"/></div></br>
<div>Password: <input type="password" name="pwd"/></div></br>

<div><input type="submit" value="Login"/>
<input type="button" value="Register" onClick="goToRegister()"/></div>

</form>

</div>
</center>

<script type="text/javascript">
function goToRegister(){
	window.location.href="/register";
}
</script> 

</body>
</html>
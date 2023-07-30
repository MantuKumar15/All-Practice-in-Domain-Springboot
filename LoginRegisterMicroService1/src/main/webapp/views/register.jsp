<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
form{
background-color: cyan;
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
<form action="/set-user" method="post">
<c:if test="${not empty error }">
<div style="color: red;"><h4>${error }</h4></div>
</c:if>
<div><h1> Registration Form </h1></div>
<div>User Id: <input type="text" name="uid"/></div></br>
<div>Password: <input type="password" name="pwd"/></div></br>
<div>Confirm Password: <input type="password" name="cpwd"/></div></br></br>
<div><input type="submit" value="register"/></div>

</form>

</div>
</center>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div class="form-center">
<form action="/Login" method="GET">
<c:if test="${error}">
<div style="color:red;"> <h4>${error}</h4></div>
</c:if>
<div> <h1>Login Form</h1> </div>
<div>User id: <input type="text" name="uid"><br></div>
<div> Password : <input type="password" name="pwd"><br></div>
<div> <input type="submit" value="login">
<input type="button" value="Register" onClick="gotoRegister()"></div>
</form>

</div>
<script type="text/javascript">
function gotoRegister()
{
 window.location.href="/register";	
}

</script>
</body>
</html>
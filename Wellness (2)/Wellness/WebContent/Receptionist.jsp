<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
/* background-image: url("r8.jpg"); */
background-repeat: no-repeat;
background-size: 1366px 768px;
}


h2{
color:blue}

b{

font-family: verdana;
 }
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Receptionist Login</title>
<script>


function validateForm() {
    var m = document.forms["myForm"]["userid"].value;
    if (m == null || m == "") {
        alert("User ID must be filled");
        return false;
    }
    var n= document.forms["myForm"]["password"].value;
    if (n == null || n == "") {
        alert("Password must not be left blank");
        return false; 
}}
</script>
</head>
<body>
<h1 style="color:green;" align="center">
Welcome to Brindavan Hospital
</h1>
<pre>

<h2 align="left"  >
Receptionist Login:
</h2>
<form action="./LoginServlet1" method="post" name="myForm" onsubmit="return validateForm()">
<b>
USER ID  :  <input type="text" name="name" required><br>
PASSWORD :  <input type="password" name="password" required>
</b><br>
<input style="font-size:20px;" type="submit"  value="Login">
</pre>
</form>


</body>
</html>
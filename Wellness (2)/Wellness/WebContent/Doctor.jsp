<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image: url("hospital3.jpg");
background-repeat: no-repeat;
background-size: 1366px 768px;

}
h1{
style="font-family:Times new roman ;color:aqua";
}
b{

font-family: verdana;
 }

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor Login</title>
<script>
function validateForm12() {
    var p = document.forms["myForm"]["name"].value;
    if (p == null || p == "") {
        alert("Name must be filled");
        return false;
    }
    var a= document.forms["myForm"]["password"].value;
    if (a == null || a == "") {
        alert("Password must not be left blank");
        return false; 
}}
</script>
</head>
<body>
<form action="./LoginServlet1" name="myForm"
onsubmit="return validateForm12()" method="post" >

<pre>
<h1 style="font-family:Times new roman" ;"color:aqua"; align="center">
Welcome to  Brindavan Hospital
</h1>
<h2 style="color:brown ;font-family: Times new roman"align="left">
Doctor Login:</h2>
<b>
USER ID:</b> <input type="text" name="name" autocomplete="on" autofocus="on" required>
<b>
PASSWORD:</b><input type="password" name="password" required>
<br>
<input style="font-size:20px;" type="submit"  value="Login">

</pre></form>
</body>
</html>
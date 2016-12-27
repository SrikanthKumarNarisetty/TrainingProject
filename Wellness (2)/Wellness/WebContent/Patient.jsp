<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style>
body{
background-image: url("page-background-default.jpg");
background-repeat: no-repeat;
background-size: 1300px 670px;
}
h2{
color:blue;}
b{

font-family: verdana;
font-weight: bolder; }
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<script>
function validateForm() {
	var y= document.forms["myForm"] ["age"].value;
	var z= document.forms["myForm"] ["phone_number"].value;
	var x = document.forms["myForm"]["name"].value;
	
	var w= document.forms["myForm"] ["gender"].value;

	var v= document.forms["myForm"] ["slot"].value;
	
	var letters=/^[A-Za-z]+$/;
	var digits=/^[0-9]+$/;

	if (x.match(letters))	{
if (y.match(digits)) {
if (z.match(digits)) {

	return true; 	
}
 

	else{
alert("phone must be filled in numbers");
return false;
}}

else{
	alert("age must be filled in numbers");
	return false;
}}
else{
	alert("name must be filled in letters");
	return false;
}}


    /*var x = document.forms["myForm"]["name"].value;
    if (x == null || x == "") {
        alert("Name must be filled");}
        return false;
    }
    var y= document.forms["myForm"] ["age"].value;
    if (y == null || y == "") {
        alert("Age must be filled");
        return false; 
}
    var z= document.forms["myForm"] ["phone_number"].value;
    if (z == null || z == "") {
        alert("Phone number must be filled");
        return false;  }
    var w= document.forms["myForm"] ["gender"].value;
    if (w == null || w == "") {
        alert("Gender must be selected");
        return false;  }
    var v= document.forms["myForm"] ["slot"].value;
    if (v == null || v == "") {
        alert("Slot must be selected");
        return false;  }}*/
</script>
</head>
<body>
   <h1 style="color:navy;" align="center">
     Welcome to Brindavan Hospital</h1>
<h4 style="color: blue;" align="center">${result1}</h4>
<h2 style="align:left;color:brown;">Registration Form:</h2>
 
 <h5 style="color: red">Fields with * are mandatory</h5>
<form name="myForm" action="./RegisterServlet1" onsubmit="return validateForm()" method="post" required >
<pre>
<b>NAME*         :</b> <input type="text" maxlength="15"  name="name" style="maxlength:10;" autocomplete="on" autofocus required>
<br>
<b>AGE*           :</b> <input type="text" name="age" maxlength="2" autocomplete="off" required >
<br>
<b>MOB*          :</b> <input type="text" name="phone_number" maxlength="10" autocomplete="off" required" >
<br>
<b>ADDRESS     :</b>    
                  <textarea rows="3" cols="20" name="address" maxlength="100" autocomplete="on" required></textarea>
<br>
<b>GENDER*   :</b><input type="radio" name="gender" value="male" required ><b>Male</b>
               <input type="radio" name="gender" value="female"required><b>Female</b>
<br>
<b>SLOT*       :</b><input type="radio" name="slot" value=1 required><b>Morning (10AM to 1PM)</b>
              <input type="radio" name="slot" value=2><b>Evening (5PM to 8PM)</b>
	  			         


 <input style="font-size: 23px;align:center;" type="submit"  VALUE="Submit">
				         
				
	
</pre>
</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validate(){
	
	 if( document.myForm.uname.value == "" )
     {
        alert( "Please provide your name!" );
        document.myForm.uname.focus() ;
        return false;
     }
	 
	 if( document.myForm.pwd.value == "" )
     {
        alert( "Please provide your password!" );
        document.myForm.pwd.focus() ;
        return false;
     }
}


</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Man Resource Pvt. Ltd.</title>
</head>
<body bgcolor="lightblue" 
    leftmargin=0  topmargin=0 background = "job-board.jpg" background-repeat: no-repeat>
<style>
td{font:11pt verdana}
a  {color:maroon;font:700 11pt verdana}
h3 {color:navy;font:700 20pt arial}
</style>
<center>

<marquee><font color="#A3ACA9" size="20">Man Resource Pvt. Ltd.</font></marquee>

<p>

<p>

<form name="myForm" action="./ReloginServlet1" method=post onsubmit ="return(validate());">
<fieldset style ="width:280px; height:100px; float:left; background-color:black; opacity:0.7;" >
<table align="right">

<tr>
<td><font color="olive" size="3">Username</font> 
<td> <input type=text size=20 name=name placeholder = "username" >
</tr>
<tr>
<td><font color="olive" size="3">Password </font>
<td><input type=password  size=20 name=Gen placeholder = "coupon">
</tr>
<tr>
<td>
<td>

<input type=submit value="Login">

<input type="reset" value="reset">
</td>
</tr>

</table>
</fieldset>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<table align="left">

<tr>
<td>
<a href="newemployee.html"><font color="white">New Employee</font></a>
&nbsp;&nbsp;
</td>
</tr>

<tr>
<td>
<a href="aboutus.html"><font color="white">About Us</font></a>
</td>
</tr>
<tr>
<td>
<a href="admin.jsp"><font color="white">Admin</font></a>
</td>
</tr>
</table>

</form>
</body>
</html>
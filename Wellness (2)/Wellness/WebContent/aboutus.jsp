<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<style>
.footer{ 
       position: fixed;     
 text-align: right;    
       bottom: 0px; 
       width: 100%;
       }
body{
background-image: ("bg_contact.jpg")
background-repeat: no-repeat;
background-size: 1366px 768px;

}
img { 
    width:10%; 
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About US</title>
</head>
<body>

<h1 style="color:blue;" align="center">
Welcome to Brindavan Hospital
</h1>
<h4 style="color: red;">${result}</h4>
<br>

<br><font size="5">Brindavan Hospital is a leading integrated healthcare delivery service provider in India.
 <br>   The healthcare verticals of the company primarily comprise hospitals, diagnostics and day care specialty facilities.
</font>

<h2>OUR MISSION</h2>
<a><img border="0" src="mission.jpg" style="width:400px;height:300px;align:center;"></a>
<br>
<h2>Our Guiding Principles</h2>
<br><font size="5">*Work to Give
<br>*Word is a Bond
<br>*Act Local,Think Global.
<br>*Advance Fearlessly.
<br>*Partnership for Growth.
</font>
<br>

<!-- <table>
<tr>
<th>
<img border="0" src="doctor1.jpg" width="200" height="200" >
</th>
<th>
<img border="0" src="doctor2.jpg" width="100" height="100">
</th>

<th>
<img border="0" src="doctor3.jpg" width="100" height="100">
</th>
</tr>
</table>
-->
</body>
</html>
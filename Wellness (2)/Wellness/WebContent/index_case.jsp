<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<style>
.button {
    background-color: #00b4d8;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
.header{
   position: fixed;     
 text-align: right;    
       top: 100px; 
       right:100px;
       width: 200%;
}
.footer{ 
       position: fixed;     
 text-align: right;    
       bottom: 50px; 
       right:50px;
       width: 100%;
       }
       .feet{ 
       position: fixed;     
 text-align: center;    
       bottom: 50px; 
       left:0px;
       width: 100%;
       }
body{
background-image: url("care.jpg");
background-repeat: no-repeat;
background-size: 1366px 768px;

}
img { 
    width:10%; 
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Brindavan Hospital</title>
</head>
<body>
<div class="header">
<form action="./Relogin.jsp">
<input type="submit" value="Login" class="button">
</form>
 </div>
<div class="footer">
<form action="./aboutus.jsp">
<input type="submit" value="About Us" class="button">
</form>
 
 

 </div>
 <div class="feet">
 <form action="./ourdoctors.jsp" >
<input type="submit" value="Our Doctors" class="button" align="center">
</form>
</div>

<h1 style="color:#ffc036;" align="center">
Welcome to Brindavan Hospital
</h1>
<h4 style="color: red;">${result}</h4>
<br>
<br>
<br>
<br>

<pre>                                               </pre>
<pre> </pre><marquee><table align="center">
  <tr>
    <th >Patient</th>
    <th></th>
    <th></th>
    <th></th>
    <th></th>
    <th></th>
    <th></th>
    <th></th>
    
    <th>Doctor</th> 
   <th></th>
   <th></th>
   <th></th>
   <th></th>
   <th></th>
   <th></th>
   <th></th>
    <th>Receptionist</th>
  </tr>

<tr >
    <td><form action="./Patient.jsp" >
<p>

<a href="./Patient.jsp">
<img border="2" src="doctor-reassuring-elderly-woman-article.jpg" style="height:300px;width:250px;">
</a>
</p>
</form></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>

 <td>
<form action="./Doctor.jsp" >
<p>
<a href="./Doctor.jsp">
   <img border="2" src="young-doctors.jpg" style="height:300px;width:250px;">  
</a></p>


</form></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
    <td><form action="./Receptionist.jsp">
    <p><a href="./Receptionist.jsp">
<img border="2" src="Receptionist.jpg"  style="height:300px;width:250px;" >
</a></p>

</form></td>
  </tr>

</table>
</marquee>




</body>
</html>
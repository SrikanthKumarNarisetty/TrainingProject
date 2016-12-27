<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<style>
.footer{ 
       position: fixed;     
       text-align: center;    
       bottom: 0px; 
       width:100%;
       }
body{

background-image: url("M.jpg");
background-repeat: no-repeat;
background-size: 1366px 768px;

}
img { 
   border-color:white;
    width:10%; 
}
th {
    display: table-cell;
    vertical-align: inherit;
    font-weight: bolder;
    font-size:x-large;
    text-align: center;
    
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Brindavan Hospital</title>
</head>
<body>
 <div class="footer">
 <pre><marquee><b> Dial 102,108 for ambulance services. Recent awards: Best hospital award in Quality and Care category.</b></marquee>
 Delivering the best,  		
 Contact us on 080-26728000,001,002 All Rights Reserved, (c)2016

 </pre>
 </div>
 <img src="Hospital.jpg" alt="Smiley face" align="right">
<h1 style="color:green;" align="center">

</h1>
<h4 style="color: red;">${result}</h4>

<br>
<br>


<pre>                                               </pre>
<pre> </pre><table align="center">
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
<img border="2" src="p.jpg" style="height:300px;width:250px;">
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
   <img border="2" src="doctor1.jpg" style="height:300px;width:250px;">  
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
<img border="2" src="r.jpg"  style="height:300px;width:250px;" >
</a></p>

</form></td>
  </tr>


</table>



















</body>
</html>

<%@page import="com.io.Doctor1"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image: url("doctor1.jpg");
background-repeat: no-repeat;
background-size: 1366px 768px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient List Doctor 1</title>
</head>
<body>
<h1>Patients List</h1>
<h4>Hello Doctor,these are your appointments for the day.</h4>


</head>
<body>
<table border=1>
<tr><th>Name</th><th>Age</th><th>Gender</th><th>Slot</th><th>Token Number</th>
</tr>

<c:forEach items="${requestScope.list}" var="doc1">


<tr><td><c:out value="${doc1.name}"></c:out></td>
<td><c:out value="${doc1.age}"></c:out></td>
<td><c:out value="${doc1.gender}"></c:out></td>
<td><c:out value="${doc1.slot}"></c:out></td>
<td><c:out value="${doc1.gen}"></c:out></td>
</tr>
</c:forEach>

</table>

<br>
<br>
<form action="./Doctor.jsp" >
<input style="font-size:20px;" type="submit" value="Logout" >
</form>

</body>
</html>
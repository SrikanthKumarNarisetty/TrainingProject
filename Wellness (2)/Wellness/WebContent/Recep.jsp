``<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image: url("r4.jpg");
background-repeat: no-repeat;
background-size: 1366px 768px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome, Receptionist</title>
</head>
<body>
Welcome, select your course of action.
<br>
<br>
<form action="./Doctor1Servlet">
<input style="font-size:20px;" type="submit"  VALUE="Doctor1 Appointments">
</form>
<br>
<br>
<form action="./Doctor2Servlet">
<input style="font-size:20px;" type="submit"  VALUE="Doctor2 Appointments">
</form>
<br>
<br>
<form action="./Doctor3Servlet">
<input style="font-size:20px;" type="submit"  VALUE="Doctor3 Appointments">
</form>
<br>
<br>
<form action="./Patient.jsp">
<input style="font-size:20px;" type="submit"  VALUE="Patient Registration">
</form>
<br>
<form action="./index_case.jsp">
<input style="font-size:20px;" type="submit"  VALUE="Logout">
</form>




<br>
<br>
</body>
</html>
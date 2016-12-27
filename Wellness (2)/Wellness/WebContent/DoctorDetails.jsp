<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image: url("DoctorDetails.jpg");
background-repeat: no-repeat;
background-size: 1366px 768px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome, Receptionist</title>
</head>
<body>
<pre>
<h3 align="center" >
<b>Appointment Table</b>
</h3>
<br>

		Select button whose list of appointments you want to view.
<br>
<form action="./Doctor1Servlet">
		<input type="submit"  VALUE="Doctor 1 Patient List">
</form>


<form action="./Doctor2Servlet">
		<input type="submit"  VALUE="Doctor 2 Patient List ">
</form>


<form action="./Doctor3Servlet">
		<input type="submit"  VALUE="Doctor 3 Patient List ">
</form>

</pre>

</body>
</html>
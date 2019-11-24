<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<style>

body {
  background-image: url("https://cdn2.momjunction.com/wp-content/uploads/2015/05/Preschool-Vs.-Daycare-Which-One-Is-Better.jpg");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center top;
  background-size: cover;
}
	
input[type=text] {
  width: 30%
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px black;
  background-color: lightblue;
  color: BLACK;
  
}
</style>
<meta charset="ISO-8859-1">
<title>Day Care Web App</title>
</head>
<body>

	<div><img alt="daycare" src="https://logos.textgiraffe.com/logos/logo-name/16493806-designstyle-daycare-l.png"></div>
	<form action ="studentimmurec.jsp" method="post">
	  	<p style="color:DodgerBlue;">Student<br>
	  	<p style="color:Tomato;">Name:<br>
	  	<input type="text"  name="Name"><br>
	  	
	  	<p style="color:Tomato;">Age:<br>
	  	<input type="text" name="Age"><br>
	  	
	  	<p style="color:Tomato;">Gpa:<br>
	  	<input type="text"name="Gpa"><br>
	  	
	  	<p style="color:Tomato;">Parents' Name:<br>
	  	<input type="text" name="ParentName"><br>
	  	
	  	<p style="color:Tomato;">Address:<br>
	  	<input type="text" name="Address"><br>
	  	
	  	<p style="color:Tomato;">Phone Number:<br>
	  	<input type="text" name="PhoneNumber"><br>
	        <input type="submit" value="Inset Student"/> 
	</form>
	
	<form action ="insertTeacher.jsp" method="post">
	  	<p style="color:DodgerBlue;">Teacher<br>
	  	<p style="color:Tomato;">Name:<br>
	  	<input type="text"  name="tName"><br>
	  	
	  	<p style="color:Tomato;">Age:<br>
	  	<input type="text" name="tAge"><br>
	  	
	  	<p style="color:Tomato;">Credit :<br>
	  	<input type="text" name="tCredit"><br>
	  	
	 	<br/><br/> 
	        <input type="submit" value="Inset Teacher"/> 
		
		
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String Hib = request.getParameter("Name");
String Tdap = request.getParameter("Age");
String Dtap = request.getParameter("Gpa");
String student_pname = request.getParameter("ParentName");
String student_address = request.getParameter("Address");
String student_phonenum = request.getParameter("PhoneNumber");


try
{
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con =DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
	Statement st=con.createStatement();

}
	catch(Exception e)
	{
	System.out.print(e);
	e.printStackTrace();
	}
%>
<form action ="processimmurec.jsp" method="post">
	  	<p style="color:DodgerBlue;">Student Immunization Record<br>

	  	<p style="color:DodgerBlue;">Hib :<input type="text" name="Hibshots"><br>
	  	<p style="color:DodgerBlue;">Tdap :<input type="text" name="Tdapshots"><br>
	  	<p style="color:DodgerBlue;">DTap :<input type="text" name="Dtapshots"><br>
	  	<p style="color:DodgerBlue;">Polio :<input type="text" name="Polioshots"><br>
	  	<p style="color:DodgerBlue;">Hepatitis B :<input type="text" name="Hepshots"><br>
	  	<p style="color:DodgerBlue;">MMR :<input type="text" name="MMRshots"><br>
	  	<p style="color:DodgerBlue;">Meningococcal :<input type="text" name="Meningshots"><br>
	  	<p style="color:DodgerBlue;">Varicella :<input type="text" name="Varshots"><br>

	  	<%//page turn into a processing student immunization record page and print out the successful message %>
	    <input type="submit" value="Inset Student Immunization Records and Show Updates"/> 
</form>

</body>
</html>
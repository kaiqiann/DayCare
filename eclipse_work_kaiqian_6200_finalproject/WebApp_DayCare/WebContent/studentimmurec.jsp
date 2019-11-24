<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("https://cdn2.momjunction.com/wp-content/uploads/2015/05/Preschool-Vs.-Daycare-Which-One-Is-Better.jpg");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-size: 1040px 840px;
  
}
	
input[type=text] {
  width: 30%
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: lightblue;
  color: BLACK;
  
}
</style>
<meta charset="ISO-8859-1">
<title>Insert Student Immunization Records</title>
</head>
<body>
<%
String student_name = request.getParameter("Name");
String student_age = request.getParameter("Age");
String student_gpa = request.getParameter("Gpa");
String student_pname = request.getParameter("ParentName");
String student_address = request.getParameter("Address");
String student_phonenum = request.getParameter("PhoneNumber");


try
{
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con =DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
	Statement st=con.createStatement();
	if(student_name!=null){
		int i = st.executeUpdate("insert into stu(stuname,stuage,stugpa,stupname,stuaddress,stuphonenumber) values('"
				+student_name+"','"+student_age+"','"+student_gpa+"','"+student_pname+"','"+student_address+"','"+student_phonenum+"')");
	}
}
	catch(Exception e)
	{
	System.out.print(e);
	e.printStackTrace();
	}
%>

<form action ="show.jsp" method="post">
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
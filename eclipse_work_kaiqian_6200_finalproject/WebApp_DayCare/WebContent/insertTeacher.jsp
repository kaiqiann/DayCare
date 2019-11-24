
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
<title>Insert teacher</title>
</head>
<body>
<%

String teacher_name = request.getParameter("tName");
String teacher_age = request.getParameter("tAge");
String teacher_credit = request.getParameter("tCredit");

try
{
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con =DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
	Statement st=con.createStatement();
	if(teacher_name!=null){
		int i = st.executeUpdate("insert into tea(teaname,teaage,teacredit) values('"
				+teacher_name+"','"+teacher_age+"','"+teacher_credit+"')");
	}
	
}
	catch(Exception e)
	{
	System.out.print(e);
	e.printStackTrace();
	}
%>

<form action = "show.jsp" method="post">
	Data is successfully inserted!
	<input type="submit" value = "Show Update"/> 
</form>

</body>
</html>

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
<title>DatCare Table</title>
</head>
<body>
<table border="1">
   <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Gpa</td>
        <td>Parent Name</td>
        <td>Address</td>
        <td>Phone Number</td>
   </tr>
   <%
   try {
	  	Class.forName("com.mysql.jdbc.Driver");  
		Connection con =DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
	    Statement stmt = con.createStatement();  
		ResultSet rs = stmt.executeQuery("select * from stu");  
		while(rs.next()) 
		{
   %>
			<tr>
			<td><%=rs.getString("stuname") %></td>
			<td><%=rs.getInt("stuage") %></td>
			<td><%=rs.getInt("stugpa") %></td>
			<td><%=rs.getString("stupname") %></td>
			<td><%=rs.getString("stuaddress") %></td>
			<td><%=rs.getString("stuphonenumber") %></td>
			</tr>	
   <% }
   %>

   <%	
        rs.close();
        stmt.close();
        con.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
   
   
</table>
<br><br><br>
<table border="1">
   <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Credit</td>
   </tr>
   <%
   try {
	  	Class.forName("com.mysql.jdbc.Driver");  
		Connection con =DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
	    Statement stmt = con.createStatement();  
		ResultSet rs = stmt.executeQuery("select * from tea");  
		while(rs.next()) 
		{
   %>
			<tr>
			<td><%=rs.getString("teaname") %></td>
			<td><%=rs.getInt("teaage") %></td>
			<td><%=rs.getInt("teacredit") %></td>
			</tr>	
   <% }
   %>

   <%	
        rs.close();
        stmt.close();
        con.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
   
   
</table>

	<form action = "insert.jsp" method="post">
		<input type="submit" value = "Back to Home"/> 

	</form>
</body>
</html>
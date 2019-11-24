<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
		<input type="submit" value = "Back To Home"/> 

	</form>
</body>
</html>
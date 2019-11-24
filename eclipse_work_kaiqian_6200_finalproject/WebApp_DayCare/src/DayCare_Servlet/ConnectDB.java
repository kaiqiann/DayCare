package DayCare_Servlet;

import java.sql.*; 

public class ConnectDB {

	protected static Connection initializeDatabase() 
	        throws SQLException, ClassNotFoundException 
	    { 
			// TODO Auto-generated method stub
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con =DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
			/*
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from hotels");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();*/  
			return con;
	}  
}
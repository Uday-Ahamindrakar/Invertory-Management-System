package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{
	
	Connection con;
	
	public static Connection DBconnect()
	{
		DBconnection connect = new DBconnection();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connect.con = DriverManager.getConnection("jdbc:mysql://localhost:3308/javapos", "root", "");
			return connect.con;
		} catch (Exception e)
		{
			
			System.out.println("Failure"+e);
			return null;
		}
	}
}

package com.preTraining.epicor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCHelper 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try 
		{
			Class.forName(Constants.FQCN);
			con=DriverManager.getConnection(Constants.URL,Constants.UID,Constants.PWD);
			return con;
		}
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return con;
		}
		catch (ClassNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return con;
		}
	}
	public static void close(Statement s)
	{
				
			try 
			{
				if(s!=null)
				s.close();
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void close(ResultSet rs)
	{
		try 
		{
			if(rs!=null)
				rs.close();
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void close(Connection con)
	{
		try
		{
			if(con!=null)
				con.close();
			
		} 
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

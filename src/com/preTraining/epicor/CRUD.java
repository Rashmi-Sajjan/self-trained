package com.preTraining.epicor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD
{
	 public static void main(String[] args)
	 {
		Connection con=null;
		PreparedStatement pr_sel=null;
		ResultSet rs=null;
		try
		{
			con=JDBCHelper.getConnection();
			pr_sel=con.prepareStatement("select * from customer");
			rs=pr_sel.executeQuery();
			System.out.println("-------------------------------------------------------------------");
			System.out.format("%s%10s%30s%80s%20s%10s", "sl-no","ID","Name","Desc","Email","Dob");
			System.out.println("");
			while(rs.next())
			{
				//System.out.format()
				System.out.format("%d%14s%30s%80s%20s%10s",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
			
		} 
		catch (SQLException e)
		{
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Opps Error in SQL "+e.getMessage());
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Oops something bad happened"+e.getMessage());
		}
		finally
		{
			JDBCHelper.close(rs);
			JDBCHelper.close(pr_sel);
			JDBCHelper.close(con);
		}
	 }
}

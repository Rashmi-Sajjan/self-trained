package com.preTraining.epicor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model
{
	public String saveToDB(FormBean fb)
	{
		StringBuilder  sb=null;
		Connection con=null;
		PreparedStatement pr_ins=null;
		PreparedStatement pr_sel=null;
		ResultSet rs=null;
		try 
		{
			con=JDBCHelper.getConnection();
			pr_ins=con.prepareStatement("insert into Form(name,email,gender,city)values(?,?,?,?)");
			pr_sel=con.prepareStatement("select * from form where email=?");
			String name=fb.getName();
			String email=fb.getEmail();
			String gender=fb.getGender();
			String city=fb.getCity();
			pr_sel.setString(1, email);
			rs=pr_sel.executeQuery();
			sb=new StringBuilder();
			if(name==null || name.equals("") ||email==null ||email.equals("")||gender==null||gender.equals("")||city==null||city.equals(""))
				sb.append("All fields are mandatory");
			if(rs.next()==true)
				sb.append("Given Email is already present in database");
			if(email!=null && email.indexOf("@")==-1)
				sb.append("Not a valid email");
			if(sb.toString().equals(""))
			{
				pr_ins.setString(1,name);
				pr_ins.setString(2,email);
				pr_ins.setString(3,gender);
				pr_ins.setString(4,city);
				pr_ins.execute();
				sb.append(Constants.SUCCSESS);
			}
			
			return sb.toString();
		} 
		catch (SQLException e)
		{
			// TODO: handle exception
			e.printStackTrace();
			sb.append("Some SQL Error"+e.getMessage());
			return sb.toString();
		}
		finally
		{
			JDBCHelper.close(rs);
			JDBCHelper.close(pr_sel);
			JDBCHelper.close(pr_ins);
			JDBCHelper.close(con);
		}
	}

}

package com.lti;

import java.util.*;
import java.sql.*;

public class CustomerDAO {

		
		public static Connection getConnection()// create a connection to oracle
		{
		Connection con=null;
		{
			try 
			{
				 Class.forName("oracle.jdbc.driver.OracleDriver");
				 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			}
			catch (Exception e)
			{
				System.out.println("Error in connection"+ e);
			}
			return con;
		}
		}
public static int insertCustomer(Customer c) {
	int status=0;
	try {
		
		Connection con = CustomerDAO.getConnection();   // static methods are called thru class  here getConnection() is a static method 
		PreparedStatement ps=con.prepareStatement    // ps is a query which will accept values at runtime
				("insert into users100 values"
		+ "(user_id100.NEXTVAL,?,?,?,?)");
		ps.setString(1, c.getName());
		ps.setString(2, c.getPassword());
		ps.setString(3, c.getEmail());	
		ps.setString(4, c.getCountry());
		 status =ps.executeUpdate();  //  all dml ststement will return integer val here status is declared as integer
		con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return status;
	
}

public static int deleteCustomer(long id) {
	int status=0;
	try {
		Connection con=CustomerDAO.getConnection();
		PreparedStatement ps=con.prepareStatement("" + "delete from users100 where id=?");
		ps.setLong(1,id);
		status=ps.executeUpdate();
		
		con.close();
	}catch (Exception e) {e.printStackTrace();}
	return status;
}

public static int updateCustomer(Customer e) {
	int status=0;
	try {
		Connection con=CustomerDAO.getConnection();
		PreparedStatement ps=con.prepareStatement("update users100 set name=?,password=?,email=?,country=? where id=?");
		ps.setString(1,e.getName());
		ps.setString(2,e.getPassword());
		ps.setString(3,e.getEmail());
		ps.setString(4,e.getCountry());
		ps.setLong(5,e.getId());
		
		status=ps.executeUpdate();
		con.close();
	}catch (Exception ex) {ex.printStackTrace();}
	return status;
	}

public static Customer getCustomerById(long id) {
	Customer c=new Customer();
	try {
		Connection con=CustomerDAO.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from users100 where id=?");
		ps.setLong(1,id);
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			c.setId(rs.getLong(1));
			c.setName(rs.getString(2));
			c.setPassword(rs.getString(3));
			c.setEmail(rs.getString(4));
			c.setCountry(rs.getString(5));
		}
		con.close();
}catch (Exception ex) {ex.printStackTrace();}
	return c;
}
public static List<Customer> getAllEmployees()
{
   List <Customer> list=new ArrayList<Customer>();
   try 
   {
	   Connection con= CustomerDAO.getConnection();
	   PreparedStatement ps=con.prepareStatement("select* from users100");
	   ResultSet rs=ps.executeQuery();
	   while(rs.next()) 
	   {
		   
		   Customer c=new Customer();
		   c.setId(rs.getInt(1));
		   c.setName(rs.getString(2));
		   c.setPassword(rs.getString(3));
		   c.setEmail(rs.getString(4));
		   c.setCountry(rs.getString(5));
		   list.add(c);
	   } con.close();
   }  catch(Exception e) {e.printStackTrace();}
   return list;
	
}
	
}

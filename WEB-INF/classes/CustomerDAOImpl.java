package com.pk.raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {
	
	static Connection con;
	static PreparedStatement ps;
	
	@Override
	public int insertCustomer(Customer c) {
		int status=0;
		try {
			con=MyConnectionProvider.getcon();
			ps=con.prepareStatement("insert into user1 values(?,?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getName());
			ps.setString(3, c.getPassword());
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String pass) {
		Customer c=new Customer();
		
		try {
			con=MyConnectionProvider.getcon();
			ps=con.prepareStatement("select * from user1 where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return c;
	}

}

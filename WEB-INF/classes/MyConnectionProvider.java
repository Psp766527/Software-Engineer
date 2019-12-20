package com.pk.raj;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {

	static Connection con=null;
	
	public static Connection getcon() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("username", "pwd", "connUrl");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
}

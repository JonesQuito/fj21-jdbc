package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory2 {
	
	private static Connection conn = null;
	
	public static Connection getConnection(){
		
		if(conn != null){
			return conn;
		}
		else{
			try{	
				conn = DriverManager.getConnection("jdbc:mysql://localhost/fj21?autoReconnect=true&useSSL=false", "root", "123456");
				return conn;
			}
			catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

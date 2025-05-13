package de.teelekom.coffeerating.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCOperator {

	private PreparedStatement pstmt;
	private Connection connection;
	
	
	public JDBCOperator() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7778575", "sql7778575", "NQVV7HBvwt");
			System.out.println(connection.isValid(0));
			
			String sql = "SELECT * FROM users WHERE username = ? AND password_hash = ?";
			pstmt = connection.prepareStatement(sql);
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public boolean checkUsernamePasswordCombination(String username, String password) {
		try {
		 pstmt.setString(1, username);
         pstmt.setString(2, password);
        
        try (ResultSet rs = pstmt.executeQuery()) {
              if(rs.next()) {
           	   return true;
              } else {
           	   return false;
              }
           }
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	} 
	
}

package de.teelekom.coffeerating.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCOperator {

	private PreparedStatement pstmt;
        private PreparedStatement getCoffeeNamesstmt;
        private PreparedStatement findItemByNameStmt;
        private PreparedStatement sendReviewStmt;
        private PreparedStatement getRatingsStmt;
        
	private Connection connection;
        
	
	public JDBCOperator() {
		init();
	}
        private void init() {
            try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7778575", "sql7778575", "NQVV7HBvwt");
			String sql = "SELECT * FROM users WHERE username = ? AND password_hash = ?";
                        String getCoffeNamessql = "SELECT Name FROM coffeetypes";
                        String finyItemByNameSQL = "SELECT Name, Type, Calories, Caffeine, AllergyInf FROM coffeetypes WHERE Name = ?";
                        String sendReviewSQL = "INSERT INTO ratings (Name, Taste, Price, Price_Performance, Comment, Total_Rating) VALUES (?, ?, ?, ?, ?, ?);";
                        String getRatingsSQL = "SELECT Name, Taste, Price, Price_Performance, Comment, Total_Rating FROM ratings;";
                        
                        
			pstmt = connection.prepareStatement(sql);
                        getCoffeeNamesstmt = connection.prepareStatement(getCoffeNamessql);
                        findItemByNameStmt = connection.prepareStatement(finyItemByNameSQL);
                        sendReviewStmt = connection.prepareStatement(sendReviewSQL);
                        getRatingsStmt = connection.prepareStatement(getRatingsSQL);
			
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
        
        
        public ArrayList<String> getCoffeeNames() {
            ArrayList<String> names = new ArrayList<String>();
            try {
                
            ResultSet rs = getCoffeeNamesstmt.executeQuery();
                while (rs.next()) {
                // Spaltenname "name" auslesen
                String name = rs.getString("name");
                names.add(name);
            }
                
                
            }catch(SQLException ex) {
               
            }
              return  names;
            
        }
        
        
  public Item findByName(String name) {
            
            try {
            findItemByNameStmt.setString(1, name);
            ResultSet rs = findItemByNameStmt.executeQuery();
            if(rs.next()) {
                String type = rs.getString("Type");
                int calories = rs.getInt("Calories");
                double caffeine = rs.getDouble("Caffeine");
                String allergyInfo = rs.getString("AllergyInf");
                return new Item(name, type, calories, caffeine, allergyInfo);
            }
            
            } catch(SQLException ex) {
                ex.printStackTrace();  
            }
        
	return null;
} 
  public void postReview(String name, double taste, int price, double pricePerformance, String comment, double totalRating) {
      try {
          sendReviewStmt.setString(1, name);
          sendReviewStmt.setString(2, String.valueOf(taste));
          sendReviewStmt.setString(3, String.valueOf(price));
          sendReviewStmt.setString(4, String.valueOf(pricePerformance));
          sendReviewStmt.setString(5, comment);
          sendReviewStmt.setString(6, String.valueOf(totalRating));
          sendReviewStmt.execute();
          System.out.println("Posted");
          
      }catch(SQLException ex) {
          ex.printStackTrace();
      }
      
      
  }
  
 public ArrayList<Rating> getAllRatings() {
          ArrayList<Rating> ratings = new ArrayList<>();
          
          try {
          ResultSet rs = getRatingsStmt.executeQuery();
           while (rs.next()) {
                String name = rs.getString("Name");
                String taste = rs.getString("Taste");
                String price = rs.getString("Price");
                String pricePerformance = rs.getString("Price_Performance");
                String comment = rs.getString("Comment");
                String totalRating = rs.getString("Total_Rating");
                ratings.add(new Rating(
                    name,
                    taste,
                    price,
                    pricePerformance,
                    comment,
                    totalRating
                ));
            }
         return ratings;
          } catch(SQLException ex) {
              ex.printStackTrace();
                      
          }
          return ratings;
 
 }
}
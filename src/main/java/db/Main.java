package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.net.ssl.SSLException;

public class Main {
	static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	// update USER, PASS and DB URL according to credentials provided by the website:
	// https://remotemysql.com/
	// in future move these hard coded strings into separated config file or even better env variables
	static private final String DB = "7VP6RBaQoU";
	static private final String DB_URL = "jdbc:mysql://remotemysql.com/"+ DB + "?useSSL=false";
	static private final String USER = "7VP6RBaQoU";
	static private final String PASS = "ov97FOeUst";
//	static private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//
//	// update USER, PASS and DB URL according to credentials provided by the website:
//	// https://remotemysql.com/
//	// in future move these hard coded strings into separated config file or even better env variables
//	static private final String DB = "tTlqtrOyrs";
//	static private final String DB_URL = "jdbc:mysql://remotemysql.com/"+ DB + "?useSSL=false";
//	static private final String USER = "tTlqtrOyrs";
//	static private final String PASS = "kC6AoWqQAO";

	public static void main(String[] args) throws SSLException {
//		Connection conn = null;
//		Statement stmt = null;
//		try {
//			Class.forName(JDBC_DRIVER);
//			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			stmt = conn.createStatement();
//
//			System.out.println("\t============");
//
//			String sql = "SELECT * FROM flights";
//			ResultSet rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				int num = rs.getInt("num");
//				String origin = rs.getString("origin");
//				String destination = rs.getString("destination");
//				int distance = rs.getInt("distance");
//				int price = rs.getInt("price");
//
//				System.out.format("Number %5s Origin %15s destinations %18s Distance %5d Price %5d\n", num, origin, destination, distance, price);
//			}
//
//			System.out.println("\t============");
//
//			sql = "SELECT origin, destination, distance, num FROM flights";
//			rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				String origin = rs.getString("origin");
//				String destination = rs.getString("destination");
//				int distance = rs.getInt("distance");
//
//				System.out.print("From: " + origin);
//				System.out.print(",\tTo: " + destination);
//				System.out.println(",\t\tDistance: " + distance);
//			}
//
//			System.out.println("\t============");
//			
//			sql = "SELECT origin, destination FROM flights WHERE distance > ?";
//			PreparedStatement prep_stmt = conn.prepareStatement(sql);
//			prep_stmt.setInt(1, 200);
//			rs = prep_stmt.executeQuery();
//			while (rs.next()) {
//				String origin = rs.getString("origin");
//				System.out.println("From: " + origin);
//			}
//			// Update flight 387
//			sql = "UPDATE flights SET price=2019 WHERE num = 387";
//			stmt.executeUpdate(sql);
//			
//			sql = "SELECT * From flights WHERE num=387";
//			rs = stmt.executeQuery(sql);
//			if( rs.next()) {
//
//				System.out.println("The new price form:"+rs.getString("origin")+" \t To:"+rs.getString("destination") +"\t Is: "+rs.getInt("price"));
//			}
//			// Query ResultSet
//			sql="SELECT * FROM flights WHERE distance > 1000";
//			Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			rs = st.executeQuery(sql);
//			while(rs.next()) {
//				int pr=rs.getInt("price")+100;
//				rs.updateInt("price", pr);
//				rs.updateRow();
//			}
//			
//			sql="SELECT * FROM flights WHERE price < 300";
//			st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			rs = st.executeQuery(sql);
//			while(rs.next()) {
//				int newPrice=rs.getInt("price")-25;
//				rs.updateInt("price", newPrice);
//				rs.updateRow();
//			}
//			
//			//Query PreparedStatement
//			sql="SELECT * FROM  flights WHERE distance>1000";
//			rs = st.executeQuery(sql);
//			PreparedStatement update= conn.prepareStatement("UPDATE flights SET price=? WHERE num =?");
//			while(rs.next()) {
//				int newPrice=rs.getInt("price")+100;
//				int num=rs.getInt("num");
//				update.setInt(1,newPrice );
//				update.setInt(2,num );
//				update.executeUpdate();
//				System.out.println(" update price by ditance");
//			}
//			
//			sql="SELECT * FROM  flights WHERE price<300";
//			rs = st.executeQuery(sql);
//			update= conn.prepareStatement("UPDATE flights SET price=? WHERE num =?");
//			while(rs.next()) {
//				int newPrice=rs.getInt("price")-25;
//				int num=rs.getInt("num");
//				update.setInt(1,newPrice );
//				update.setInt(2,num );
//				update.executeUpdate();
//				System.out.println(" update price");
//			}
//			rs.close();
//			stmt.close();
//			conn.close();
//			
//
//		} catch (SQLException se) {
//			se.printStackTrace();
//			System.out.println("SQLException: " + se.getMessage());
//            System.out.println("SQLState: " + se.getSQLState());
//            System.out.println("VendorError: " + se.getErrorCode());
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (stmt != null)
//					stmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
		
		
		
		
		
		  System.out.println("mmmmmmmmm");
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(JDBC_DRIVER);
				 System.out.println("kkkkkkkkk");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				stmt = conn.createStatement();
	
				System.out.println("\t============");
	
				String sql = "SELECT * FROM catalog";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int num = rs.getInt("num");
					String type = rs.getString("type");
					String color = rs.getString("color");
					int price = rs.getInt("price");
					System.out.format("Number %5s Type %15s color %18s  Price %d\n", num, type, color,price);
				}
			}
			catch (SQLException se) {
				System.out.println("zzzzzzzzz");
				se.printStackTrace();
				System.out.println("SQLException: " + se.getMessage());
	            System.out.println("SQLState: " + se.getSQLState());
	            System.out.println("VendorError: " + se.getErrorCode());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
	}
}

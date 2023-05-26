package daoInterface;

import java.sql.*;

public class ConnectionDAO {
	static Connection con = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	public static Connection getConnection() throws ClassNotFoundException {
		final String dburl = "jdbc:mysql://localhost:3306/library";
		final String dbusername = "root";
		final String dbpassword = "B@karS$ck9012#";
		try {
			con = DriverManager.getConnection(dburl,dbusername,dbpassword);
			System.out.println("Connection established successfully!");
		}catch(SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return con;
	}
	
	public void disconnect() {
		try {
			if(rs != null)
				rs.close();
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		}catch(Exception e) {
			
		}
	}
	
}

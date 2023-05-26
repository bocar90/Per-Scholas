package glab_305_2;

import java.sql.*;

public class Update_preparedSt_Example {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "B@karS$ck9012#";
		try {
			con = DriverManager.getConnection(dburl, user, password);
			System.out.println("Connection established successfully!");
			String sql = "update employees set firstName = ? , lastName = ? where employeeNumber = ?";
			
			prepStmt = con.prepareStatement(sql);
			prepStmt.setString(1, "Gary");
			prepStmt.setString(2, "Larson");
			prepStmt.setLong(3, 0003);
			
			int rowsAffected = prepStmt.executeUpdate();
			
			prepStmt = con.prepareStatement("select * from employees where employeeNumber = ?");
			prepStmt.setInt(1, 1401);
			//execute select query
			rs = prepStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("firstName"));
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("officeCode"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		
	}
}

package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daoInterface.BookDao;
import daoInterface.ConnectionDAO;
import model.Books;

public class BookDaoImpl extends ConnectionDAO implements BookDao {
	public void saveBook(List<Books> bookList) {
		try {
			Connection con = ConnectionDAO.getConnection();
			for(Books b: bookList) {
				String sqlQuery = "INSERT INTO books (isbn,bookName) VALUES (?,?)";
				PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
				prepStmt.setInt(1, b.getIsbn());
				prepStmt.setString(2, b.getBookName());
				int affectedRows = prepStmt.executeUpdate();
				System.out.println(affectedRows + " row(s) affected !!");
			}
		}catch(ClassNotFoundException e) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Books> getAllBooks() {
		try {
			Connection con = ConnectionDAO.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			List<Books> boollist = new ArrayList<Books>();
			while(rs.next()) {
				Books b = new Books();
				b.setIsbn(rs.getInt("isbn"));
				b.setBookName(rs.getString("bookname"));
				boollist.add(b);
			}
			return boollist;
			
		} catch(SQLException e) {
			e.printStackTrace();
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateBook(Books book, int id) {
		try {
			Connection con = ConnectionDAO.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE books SET isbn=?, bookName=? WHERE id=?");
			ps.setInt(1, book.getIsbn());
			ps.setString(2, book.getBookName());
			ps.setInt(3, id);
			int i = ps.executeUpdate();
			if(i == 1)
				return true;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}	
		return false;
	}
	
	@Override
	public boolean deleteBook(int id) {
		try {
			Connection con = ConnectionDAO.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM books WHERE id=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i == 1)
				return true;
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}
		return false;
	}
}

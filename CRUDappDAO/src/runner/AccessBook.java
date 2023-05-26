package runner;

import java.sql.SQLException;
import java.util.ArrayList;
import controller.BookDaoImpl;
import daoInterface.BookDao;
import model.Books;

public class AccessBook {

	public static void main(String[] args) {
		BookDao bookDao = new BookDaoImpl();
		System.out.println("--------- inserting book records ----------");
		ArrayList<Books> bookList = new ArrayList<Books>();

		Books b1 = new Books();
		b1.setIsbn(120);
		b1.setBookName("Java Book");
		bookList.add(b1);
		
		Books b2 = new Books();
		b2.setIsbn(300);
		b2.setBookName("Python Book");
		bookList.add(b2);
		
		Books b3 = new Books();
		b3.setIsbn(365);
		b3.setBookName("JavaScript Book");
		bookList.add(b3);
		
		Books b4 = new Books();
		b4.setIsbn(256);
		b4.setBookName("SQL Book");
		bookList.add(b4);
		
		bookDao.saveBook(bookList);
		
		System.out.println( " ====== Display list of all books ====");
		try {
		   for (Books cc : bookDao.getAllBooks()) {
		       int ISBN = cc.getIsbn();
		       String BookName = cc.getBookName();
		       System.out.println("======================");
		       System.out.println("ISBN Number :" + ISBN + "and Book name: " + BookName);

		   }
		} catch (ClassNotFoundException e) {
		   e.printStackTrace();
		} catch (SQLException e) {
		   e.printStackTrace();
		}

		System.out.println("----Book information is updating -----");
		Books bookupdating = new Books();
		bookupdating.setIsbn(3);
		bookupdating.setBookName("Algorithms Book");
		boolean result = bookDao.updateBook(bookupdating, 3);
		System.out.println(result);

		boolean a = bookDao.deleteBook(4); // 4 is a id of book
		if(a == true) 
		       System.out.println("Record is deleted");
		else
		       System.out.println("Record is not deleted");


		
	}
}

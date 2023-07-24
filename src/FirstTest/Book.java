package FirstTest;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private long ISBN;
	private static ArrayList<Book> bookscoll=new ArrayList<Book>();
	
	public Book(String title,String author,long ISBN)
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public static ArrayList<Book> getCollection()
	{
		return bookscoll;
	}
	public static void addBooks(Book book)
	{
		bookscoll.add(book);
	}
	public static void removeBook(Book book)
	{
		bookscoll.remove(book);
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public long getISBN() {
		return ISBN;
	}


	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("Ramayan","valmici",1233344);
		Book book2=new Book("Mahabharat","tulsidas",7463738);
		Book.addBooks(book1);
		Book.addBooks(book2);
		ArrayList<Book>coll=Book.getCollection();
		for(Book b:coll)
		{
			System.out.println("Title:"+b.title+" Author:"+b.author+" ISBN:"+b.ISBN);
		}
		Book.removeBook(book2);
		System.out.println("Updated");
		for(Book b:coll)
		{
			System.out.println("Title:"+b.title+" Author:"+b.author+" ISBN:"+b.ISBN);
		}
		

	}

}

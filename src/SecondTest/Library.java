package SecondTest;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> book=new ArrayList<Book>();
	
	public void addBook(Book b)
	{
		book.add(b);
	}
	public void removeBook(Book b)
	{
		book.remove(b);
	}
	public ArrayList<Book> getBooks()
	{
		return book;
	}
}

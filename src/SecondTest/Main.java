package SecondTest;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library=new Library();
		Book b1=new Book("Ramayan","valmiki");
		Book b2=new Book("Mahabharat","tulsidas");
		ArrayList<Book>list=library.getBooks();
		list.add(b1);
		list.add(b2);
		for(Book b:list)
		{
			System.out.println("name:"+b.getTitle()+" title:"+b.getAuthor());
		}
		list.remove(b1);
		for(Book b:list)
		{
			System.out.println("name:"+b.getTitle()+" title:"+b.getAuthor());
		}

	}

}

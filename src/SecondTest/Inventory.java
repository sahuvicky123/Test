package SecondTest;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Product>list=new ArrayList<Product>();
	
	public void addProduct(Product p)
	{
		list.add(p);
	}
	public void removeProduct(Product p)
	{
		list.remove(p);
	}
	public ArrayList<Product> getlist()
	{
		return list;
	}
	public void checkProduct()
	{
		for(Product p:list)
		{
			if(p.getQuantity()<=100)
			{
				System.out.println(p.getName()+" has low inventory "+p.getQuantity());
			}
			
		}
	}
	

}

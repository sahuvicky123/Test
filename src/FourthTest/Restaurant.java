package FourthTest;

import java.util.ArrayList;

public class Restaurant {
	private ArrayList<Menu>menu=new ArrayList<Menu>();
	public void addItems(Menu m)
	{
		menu.add(m);
	}
	public void removeItems(Menu m)
	{
		menu.remove(m);
	}
	public ArrayList<Menu> list()
	{
		return menu;
	}
	public double average()
	{
		double sum=0;
		for(Menu m:menu)
		{
			sum=sum+m.getRating();
		}
		return sum/menu.size();
	}

}

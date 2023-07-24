package FourthTest;

public class Menu {
	private String items;
	private float rating;
	private double price;
	public Menu(String items,float rating,double price)
	{
		this.items=items;
		this.rating=rating;
		this.price=price;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}

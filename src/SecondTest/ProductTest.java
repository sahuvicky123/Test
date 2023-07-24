package SecondTest;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("vivo v19",180);
		Product p2=new Product("vivo v21",90);
		Product p3=new Product("vivo v14",18);
		Inventory inventory=new Inventory();
		inventory.addProduct(p1);
		inventory.addProduct(p2);
		inventory.addProduct(p3);
		inventory.checkProduct();
		inventory.removeProduct(p3);
		inventory.checkProduct();

		

	}

}

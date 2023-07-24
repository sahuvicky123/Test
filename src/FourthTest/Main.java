package FourthTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rec1=new Rectangle(12, 14);
		Shape tri1=new Triangle(12, 9.6, 5.4);
		Shape cir1=new Circle(5.6f);
		System.out.println("Area of rectangle:"+rec1.area());
		System.out.println("Perimeter of rectangle:"+rec1.perimeter());
		System.out.println("Area of triangle:"+tri1.area());
		System.out.println("Perimeter of triangle"+tri1.perimeter());
		System.out.println("Area of circle"+cir1.area());
		System.out.println("Perimeter of circle:"+cir1.perimeter());

	}

}

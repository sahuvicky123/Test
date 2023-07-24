package FourthTest;

public class Circle extends Shape{
	private float radius;
	

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}

}

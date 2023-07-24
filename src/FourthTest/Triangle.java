package FourthTest;

public class Triangle extends Shape {
	private double height;
	private double base;
	private double hyp;
	

	public Triangle(double height, double base, double hyp) {
		this.height = height;
		this.base = base;
		this.hyp = hyp;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base+height)/2;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return base+height+hyp;
	}

}

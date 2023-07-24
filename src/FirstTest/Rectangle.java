package FirstTest;

public class Rectangle {
	double width,height;
	public Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public double area()
	{
		return width*height;
	}
	public double perimeter()
	{
		return 2*(width+height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle(12, 15.4);
		System.out.println("Area:"+rec.area());
		System.out.println("Perimeter:"+rec.perimeter());

	}

}

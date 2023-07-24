package FirstTest;

public class Circle {
	float radius;
	public Circle(float radius)
	{
		this.radius=radius;
	}
	

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float getArea()
	{
		return 3.13f*radius*radius;
	}
	public float getCircumference()
	{
		return 2*3.14f*radius;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(12.4f);
		System.out.println("radius:"+circle.radius);
		System.out.println("Area:"+circle.getArea());
		System.out.println("Circumference:"+circle.getCircumference());
		circle.setRadius(8.5f);
		System.out.println("radius:"+circle.radius);
		System.out.println("Area:"+circle.getArea());
		System.out.println("Circumference:"+circle.getCircumference());

	}

}

package FirstTest;

public class OopsExample {
	String name;
	int age;
	static String s="vic";
	public OopsExample(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsExample obj1=new OopsExample("vicky", 24);
		OopsExample obj2=new OopsExample("aman", 23);
		System.out.println("Name:"+obj1.name+" Age:"+obj1.age);
		System.out.println("Name:"+obj2.name+" Age:"+obj2.age);
		System.out.println(s);

	}

}

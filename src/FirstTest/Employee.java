package FirstTest;

public class Employee {
	private String name;
	private String jobtitle;
	private double salary;
	
	public Employee(String name,String jobtitle,double salary)
	{
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	public void setSalary(double interest)
	{
		salary=salary+(salary*interest)/100;
	}
	public String toString()
	{
		return "Name:"+name+" Jobtitle:"+jobtitle+" Salary:"+salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("vicky","java developer", 45000);
		Employee e2=new Employee("Python", "developer", 40000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		e1.setSalary(8);
		e2.setSalary(10);
		System.out.println(e1);
		System.out.println(e2);

	}

}

package SecondTest;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hiredate;
	
	public Employee(String name,double salary,LocalDate hiredate)
	{
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
	}
	public int getWorkingYear()
	{
		return Period.between(hiredate,LocalDate.now()).getYears();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("vicky", 34000, LocalDate.parse("2018-08-09"));
		Employee emp2=new Employee("aman", 32000, LocalDate.parse("2013-08-09"));
		Employee emp3=new Employee("sunil", 40000, LocalDate.parse("2010-08-09"));
		System.out.println("name:"+emp1.name+" salary:"+emp1.salary+" Service:"+emp1.hiredate);
		System.out.println("name:"+emp2.name+" salary:"+emp2.salary+" Service:"+emp2.hiredate);
		System.out.println("name:"+emp3.name+" salary:"+emp3.salary+" Service:"+emp3.hiredate);
		System.out.println(emp1.getWorkingYear());
		System.out.println(emp2.getWorkingYear());
		System.out.println(emp3.getWorkingYear());



	}

}

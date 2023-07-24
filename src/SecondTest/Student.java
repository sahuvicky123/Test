package SecondTest;

import java.util.ArrayList;

public class Student {
	private String name;
	private float grade;
	private ArrayList<String>courses;
	
	public Student(String name,float grade)
	{
		this.name=name;
		this.grade=grade;
		this.courses=new ArrayList<String>();
	}
	
	public void addCourse(String course)
	{
		courses.add(course);
	}
	
	public void removeCourse(String course)
	{
		courses.remove(course);
	}
	
	public ArrayList<String> getList()
	{
		return courses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("vicky",9);
		Student s2=new Student("aman",9.2f);
		Student s3=new Student("raj",9);
		s1.addCourse("English");
		s1.addCourse("Science");
		s1.addCourse("math");
		s2.addCourse("Hindi");
		s2.addCourse("Science");
		s2.addCourse("Geo");
		s3.addCourse("math");
		s3.addCourse("Science");
		s3.addCourse("marathi");
		System.out.println("name:"+s1.name+" grade:"+s1.grade+" course:"+s1.getList());
		System.out.println("name:"+s2.name+" grade:"+s2.grade+" course:"+s2.getList());
		System.out.println("name:"+s3.name+" grade:"+s3.grade+" course:"+s3.getList());
		
		s1.removeCourse("math");
		s3.removeCourse("Science");
		System.out.println("name:"+s1.name+" grade:"+s1.grade+" course:"+s1.getList());
		System.out.println("name:"+s2.name+" grade:"+s2.grade+" course:"+s2.getList());
		System.out.println("name:"+s3.name+" grade:"+s3.grade+" course:"+s3.getList());
		
		
		


		
		

	}

}

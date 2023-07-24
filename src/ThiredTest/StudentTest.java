package ThiredTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("vicky",24);
		Student s2=new Student("aman",23);
		Student s3=new Student("sunil",21);

		School school=new School();
		school.addStudent(s1);
		school.addStudent(s2);
		school.addStudent(s3);
		
		Teacher t1=new Teacher("shyam",35);
		Teacher t2=new Teacher("raj",38);
		Teacher t3=new Teacher("rohit",39);
		
		school.addTeacher(t1);
		school.addTeacher(t2);
		school.addTeacher(t3);
		
		SchoolClass c1=new SchoolClass("math", t1);
		SchoolClass c2=new SchoolClass("sci", t2);
		SchoolClass c3=new SchoolClass("hindi", t3);
		SchoolClass c4=new SchoolClass("history", t1);
		
		school.addClass(c1);
		school.addClass(c2);
		school.addClass(c3);
		school.addClass(c4);
		
		c1.addStudent(s3);
		c1.addStudent(s1);
		
		c2.addStudent(s2);
		
		c3.addStudent(s3);
		c3.addStudent(s2);
		c3.addStudent(s1);
		
		System.out.println("Total student:"+school.getStudent().size());
		System.out.println("Total teacher:"+school.getTeacher().size());
		System.out.println("Total classes:"+school.getclass().size());
		
		System.out.println(c1.getSchoolclass()+" "+c1.getTeacher().getName()+" "+c1.getTeacher().getAge()+" "+c1.getStudent().size());
		System.out.println(c2.getSchoolclass()+" "+c2.getTeacher().getName()+" "+c2.getTeacher().getAge()+" "+c2.getStudent().size());
		System.out.println(c3.getSchoolclass()+" "+c3.getTeacher().getName()+" "+c3.getTeacher().getAge()+" "+c3.getStudent().size());
		
		school.removeClass(c4);
		school.removeStudent(s3);
		school.removeTeacher(t3);
		
		System.out.println("Total student:"+school.getStudent().size());
		System.out.println("Total teacher:"+school.getTeacher().size());
		System.out.println("Total classes:"+school.getclass().size());
		
	


		

	}

}

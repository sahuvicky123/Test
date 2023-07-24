package ThiredTest;

import java.util.ArrayList;

public class School {
	ArrayList<Student>student=new ArrayList<Student>();
	ArrayList<Teacher>teacher=new ArrayList<Teacher>();
	ArrayList<SchoolClass>classes=new ArrayList<SchoolClass>();
	
	public void addStudent(Student s)
	{
		student.add(s);
	}
	public void removeStudent(Student s)
	{
		student.remove(s);
	}
	 
	public void addTeacher(Teacher t)
	{
		teacher.add(t);
	}
	public void removeTeacher(Teacher t)
	{
		teacher.remove(t);
	}
	public void addClass(SchoolClass c)
	{
		classes.add(c);
	}
	public void removeClass(SchoolClass c)
	{
		classes.remove(c);
	}
	public ArrayList<Student> getStudent()
	{
		return student;
	}
	public ArrayList<Teacher> getTeacher()
	{
		return teacher;
	}
	public ArrayList<SchoolClass> getclass()
	{
		return classes;
	}

}

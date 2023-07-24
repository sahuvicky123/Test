package ThiredTest;

import java.util.ArrayList;

public class SchoolClass {
	private String schoolclass;
	private Teacher teacher;
	private ArrayList<Student>stu;
	
	public SchoolClass(String schoolclass,Teacher teacher)
	{
		this.schoolclass=schoolclass;
		this.teacher=teacher;
		this.stu=new ArrayList<Student>();
	}
	public void addStudent(Student s)
	{
		stu.add(s);
	}
	public void removeStudent(Student s)
	{
		stu.remove(s);
	}
	public ArrayList<Student> getStudent()
	{
		return stu;
	}
	public String getSchoolclass() {
		return schoolclass;
	}
	public void setSchoolclass(String schoolclass) {
		this.schoolclass = schoolclass;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	

}

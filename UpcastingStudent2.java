package Typecasting;
class Teacher
{
	static void Teachermethod()
	{
		System.out.println("Teachermethod");
	}
}
class Mentor extends Teacher
{
	static void Mentormethod()
	{
		System.out.println("Mentormethod");
	}
}
public class UpcastingStudent2 extends Mentor 
{
	static void Studentmethod()
	{
		System.out.println("Studentmethod");
	}
	public static void main(String[] args) 
	{
		Teacher t1 = new UpcastingStudent2();  // implicit upcasting
		t1.Teachermethod();
		UpcastingStudent2 u1 = (UpcastingStudent2) t1 ; // downcasting
		u1.Mentormethod();
		u1.Teachermethod();
		u1.Studentmethod();

	}
}

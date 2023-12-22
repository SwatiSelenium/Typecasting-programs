package Typecasting;

class State
{
	void stateroad()
	{
		System.out.println("stateroad");
	}
	void statename()
	{
		System.out.println("statename");
	}
}
public class UpcastingCity1 extends State
{
	void cityroad()
	{
		System.out.println("cityroad");
	}
	void cityname()
	{
		System.out.println("cityname");
	}
	public static void main(String[] args) 
	{
		State s1 = new UpcastingCity1();  // upcasting 
		s1.statename();
		s1.stateroad();
		UpcastingCity1 u1 = (UpcastingCity1) s1 ; // downcasting
		u1.cityname();
		u1.cityroad();
		
	}

}

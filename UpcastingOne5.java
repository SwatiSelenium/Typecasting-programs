package Typecasting;

class Four
{
	static void fourmethod()
	{
		System.out.println("fourmethod");
	}
}
class Three extends Four
{
	static void threemethod()
	{
		System.out.println("threemethod");
	}
}
class Two extends Three
{
	static void twomethod()
	{
		System.out.println("twomethod");
	}
}
public class UpcastingOne5 extends Two
{
	static void onemethod()
	{
		System.out.println("onemethod");
	}
	public static void main(String[] args) 
	{
		Three t3	= new Two(); // upcasting to three class from 2 class
		t3.fourmethod();
		t3.threemethod();
		
		Two t2 = new UpcastingOne5(); //for downcasting from 2 to 1, we need to do upcasting 1st from 1 to 2

		UpcastingOne5 o1	 = (UpcastingOne5) t2; // downcasting from 2 to 1
		o1.fourmethod();
		o1.threemethod();
		o1.twomethod();
		o1.onemethod();
	}

}

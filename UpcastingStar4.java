package Typecasting;

class Square
{
	static void Squaremethod()
	{	System.out.println("Squaremethod");
	}
}
class Rectangle extends Square
{
	static void Rectanglemethod()
	{	System.out.println("Rectanglemethod");
	}
}
public class UpcastingStar4 extends Rectangle
{
	static void Starmethod()
	{	System.out.println("Starmethod");
	}
	public static void main(String[] args) 
	{
		Square s1 =	new Rectangle(); // upcasting
		s1.Squaremethod();

		Rectangle r1 =(Rectangle) s1; // downcasting
		r1.Rectanglemethod();
		r1.Squaremethod();

	}

}

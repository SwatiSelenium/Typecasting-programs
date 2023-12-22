package Typecasting;

class chrome
{	static void chromemethod()
	{
	System.out.println("chromemethod");
	}
}
class edge extends chrome
{
	static void edgemethod()
	{	System.out.println("edgemethod");
	}
}
public class Upcastingfirefox3 extends edge 
{
	static void firefoxmethod()
	{System.out.println("firefoxmethod");
	}
	public static void main(String[] args) 
	{
		edge e1	= new Upcastingfirefox3();  // upcasting
		e1.chromemethod();
		e1.edgemethod();
	
		Upcastingfirefox3 u2 = (Upcastingfirefox3) e1 ; // downcasting
		u2.firefoxmethod();
		u2.edgemethod();
		u2.chromemethod();
	}

}

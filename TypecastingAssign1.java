package Typecasting;

// converting int into double

public class TypecastingAssign1 
{
	public static void main(String[] args) 
	{
		int wt= 67;
		
		double wt1 = wt;  // implicit way of widening
		System.out.println(wt1);
		
		int age = 25;
		double age2 = (double) age;  // explicit way of widening
		System.out.println(age2);
	}
}


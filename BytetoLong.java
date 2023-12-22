package Typecasting;

// converting byte to long - widening datatype

public class BytetoLong 
{
	public static void main(String[] args) 
	{
		byte a = 126;
		long a1 = a;
		System.out.println(a1);
		
// convert long datatype to byte data type - narrowing
		
		long x = 100;
		byte x1 = (byte) x;
		System.out.println(x1);
		
	}

}

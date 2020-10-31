package simplilearn;

public class TypeCasting {

	public static void main(String[] args) {
		// implicit conversion
		System.out.println("Implicit Casting");
		char a = 'A';
		System.out.println("value of 'a' is "  + a);
		int b = a; // char can be converted into int (range)
		System.out.println("value of 'b' is " + b);// 65 unicode
		
		float c = a;
		System.out.println("value of 'c' is " +c);
		
		long d = a;
		System.out.println("value of 'd' is  "+d);
		
		double e = a;
		System.out.println("value of 'e' is " + e);
		
		// Explicit Casting
		System.out.println("\n\n");

		System.out.println("Explicit Type Casting");
		double x = 45.5;
		int y = (int)x;
		
		System.out.println("value of 'x' is " +x) ;
		System.out.println("value of 'y' is "+y);
		
		char abc = 'A'; // 16 bits ( 2 bytes ) range --- > positive 0-----65xxx
		
//		short xyz = abc ; // short ---> 16bits (2 bytes) range (+)ve 0 .... 32xxx (-)ve
		//-1 .... -32xxx
	}

}

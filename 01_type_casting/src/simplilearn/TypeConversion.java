package simplilearn;

public class TypeConversion {

	public static void main(String[] args) {
		// pass command line argument : eg 40
		System.out.println("args [ 0 ] is : " + args[0]);
		// reference type
		String value = args[0]; // 40
		
		System.out.println("Value is : " + value);
//		int x = value; // String cannot be converted to int automatically
		
		// use wrapper classes (8)
		// int -----> Integer
		//boolean ----> Boolean
		//short -----> Short
		int x = Integer.parseInt(value);
		
		// use x value for some arithmetic expression
		System.out.println(" X " + x);
	}

}

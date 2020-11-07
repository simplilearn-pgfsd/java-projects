package simplilearn;

public class MethodExecution {

	public static void main(String[] args) {
		// create an instance of MethodExecution class
		MethodExecution instance = new MethodExecution();
		
		// invoke a method multiply & collect a result
		int result = instance.multiply(10,3);
		
		System.out.println("the result of multiplication of 10,3 is : " + result);
		

	}
	
	// define a method multiple
	int multiply(int x, int y) {
		int z;
		z =  x * y;
		return z;
	}

}

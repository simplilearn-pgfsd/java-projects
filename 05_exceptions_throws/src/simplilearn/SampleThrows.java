package simplilearn;

public class SampleThrows {

	public static void main(String[] args) {
		int x, y;
		x = 45;
		y = 0;
		
		int result ;
		
		try {
			if ( y == 0) {
			throw	new  ArithmeticException("can't divide by zero.");
//				new  ArithmeticException("can't divide by zero.");
			}else {
				result = x / y;
				System.out.println("\t the result is  : " + result);
			}
		}catch (ArithmeticException e) {
			System.out.println("\n\t Error : " + e.getMessage());
		}

		System.out.println("\n\t End of program.");
	}

}

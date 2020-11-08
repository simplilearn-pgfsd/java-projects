package simplilearn;

public class SampleThrows2 {

	public void division() {
		int x, y;
		x = 45;
		y = 0;

		int result = x / y; // divide by zero
		System.out.println("\n\t the result is : " + result);
	}

	public static void main(String[] args) {
		SampleThrows2 object = new SampleThrows2();

		try {
			object.division();
		} catch (ArithmeticException e) {
			System.err.println("\n\t Error : " + e.getMessage());
		}finally {
			System.out.println("\n\t I'm executed because  finally block....");
		}
	}

}

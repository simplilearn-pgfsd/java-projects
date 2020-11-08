package simplilearn;

public class AddArguments2 {

	public static void main(String[] args) {

			int sum = 0;
			for (String element : args) {
				try {
				sum += Integer.parseInt(element); // element = two
				}catch (NumberFormatException e) {
					System.err.println("[ " + element + "] is not an integr and will not be included in the sum.");
				}
			}
			System.out.println("Sum = " + sum);
//		
	}

}

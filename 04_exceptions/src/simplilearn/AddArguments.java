package simplilearn;

public class AddArguments {

	public static void main(String[] args) {
		try {
			int sum = 0;
			for (String element : args) {
				sum += Integer.parseInt(element); // element = two
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException e) {
			System.err.println("one of the command-line arguments is not an integer");
		}
	}

}

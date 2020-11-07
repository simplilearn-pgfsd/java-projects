package simplilearn;

public class OuterClass {
	
	private String message = "welcome to java!";
	
	void  getDetails() {
		class Inner {
			void printMessage() {
				System.out.println(message);
			}
		}
		
		Inner in = new Inner();
		in.printMessage();
	}
	
	public static void main(String[] args) {
		OuterClass object = new OuterClass();
		object.getDetails();
	}

}

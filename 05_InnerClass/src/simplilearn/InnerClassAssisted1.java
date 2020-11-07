package simplilearn;

public class InnerClassAssisted1 {
	// Attribute/Field/ Instance Variable
	private String message = "welcome to java!";
	
	class Inner {
		void hello() {
			System.out.println(message + ", Let us start learning inner classes");
		}
	}
	
	public static void main(String[] args) {
		
		// create an instance of InnerClassAssisted1
		InnerClassAssisted1 object = new InnerClassAssisted1();
		// create an instance of Inner class to access hello method
		InnerClassAssisted1.Inner instance = object.new Inner();
		instance.hello();
		
	}

}

package simplilearn;

// call by value  ( primitive type )

public class CallMethod {
	
	int value  = 150;// instance variable
	
//	static int value = 150; class/static variable

	public static void main(String[] args) {
		// create an instance of CallMethod
		CallMethod instance = new CallMethod();
		System.out.println("Before operation value of data is " + instance.value);
		instance.operation(100);
		System.out.println("after operation value of data is " + instance.value);
	}
	
	// instance method
	int operation(int x) {
		value = value * 10 / 100 ;
		return value;
	}

//	static int operation(int x) {} class/static method
}

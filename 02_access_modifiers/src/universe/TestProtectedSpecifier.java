package universe;

import simplilearn.ProtectedSpecifier;

public class TestProtectedSpecifier {

	public static void main(String[] args) {
		// create an object (instance) of DefaultSpecifier
		ProtectedSpecifier access = new ProtectedSpecifier();
//		access.display();
		
		SubClass instance = new SubClass();
		instance.display();

	}

}

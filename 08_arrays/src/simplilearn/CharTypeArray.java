package simplilearn;

public class CharTypeArray {

	//A method can return an array of character's
	char[] createArray() {
		// step #1 : Declare an array
		char[] s;
		//step #2 : Create/Construct an array
		s = new char[26];
		//step #3: Initialize an array
		for (int i = 0 ; i < s.length ; i++) {
			s[i] = (char)('A' + i);
		}
		return s;
		
	}
	
	public static void main(String[] args ) {
		//create an instance of CharTypeArray
		CharTypeArray instance = new CharTypeArray();
		//invoke a createArray  method
		char[] characters = instance.createArray();
		
		//print the elements of an array
		instance.printElements(characters);
	}

	private void printElements(char[] characters) {
		for(char element: characters) {
			System.out.println(element);
		}
		
	}

}

package simplilearn;

public class Student {
	
	int id;
	String name;
	
	//NOTE: javac doesn't provide default constructor 
	
	//define a parameterized constructor
	Student(int i , String n) {
		id = i;
		name = n;
	}

	void getDetails() {
		System.out.println(id + "\t\t" + name);
	}
}

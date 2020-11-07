package simplilearn;

public class TestStudent {

	public static void main(String[] args) {
		// create instance's of Student
		Student firstStudent = new Student(101, "vinodh");
		Student secondStudent = new Student(102,"mahendra");
		
		firstStudent.getDetails();
		secondStudent.getDetails();
	}
}

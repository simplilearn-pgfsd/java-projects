package simplilearn;

public class TestEncapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("vinodh");
		student.setRollno(1010);
		student.setAge(39);

		System.out.println("Name  : " + student.getName());
		System.out.println("Age   : " + student.getAge());
		System.out.println("Roll no : " + student.getRollno());
	}

	
}

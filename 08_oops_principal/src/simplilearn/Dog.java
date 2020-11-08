package simplilearn;

public class Dog {

	String name;
	String breed;
	int age;
	String color;
	
	public Dog(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return String.format("Dog [name=%s, breed=%s, age=%s, color=%s]", name, breed, age, color);
	}
	
	

	
}


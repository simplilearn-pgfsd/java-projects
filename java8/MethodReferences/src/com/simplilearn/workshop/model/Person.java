package com.simplilearn.workshop.model;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	// static instance method
	public static int compareAges(Person x, Person y) {
		Integer age_of_person_x = x.getAge();
		return age_of_person_x.compareTo(y.getAge());
	}

}

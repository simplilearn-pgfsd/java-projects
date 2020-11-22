package com.simplilearn.workshop.interfaces;

public interface PersonInterface {
	public String getName();
	public void setName(String name);
	public int getAge();
	public void setAge(int age);
	
	// define a method (default)
	default String getPersonInfo() {
		return getName() + " (" +getAge() + ")";
	}
}

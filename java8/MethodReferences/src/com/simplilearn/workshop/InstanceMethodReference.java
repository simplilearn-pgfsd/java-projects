package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.simplilearn.workshop.model.Person;

public class InstanceMethodReference {

	public static void main(String[] args) {
		InstanceMethodReference mainClass = new InstanceMethodReference();
		mainClass.sortData();
	}
	
	private void sortData() {
	       List<Person> people = new ArrayList<Person>();
			people.add(new Person("Joe", 48));
			people.add(new Person("Mary", 30));
			people.add(new Person("Mike", 73));
			
			// instance method reference (java 8)
			Collections.sort(people, this :: compareAges);
			
			people.forEach(person -> System.out.println(person));
		
	}

	// instance method
	public int compareAges(Person x, Person y) {
		Integer age_of_person_x = x.getAge();
		return age_of_person_x.compareTo(y.getAge());
	}

}

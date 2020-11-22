package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.simplilearn.workshop.model.Person;

public class StaticMethodReference {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		// static method reference
		Collections.sort(people, Person::compareAges);
		people.forEach(person -> System.out.println(person));
	}

}

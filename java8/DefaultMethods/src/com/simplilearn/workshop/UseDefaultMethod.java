package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.simplilearn.workshop.model.Person;

public class UseDefaultMethod {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		displayPeople(people);
		
		Predicate<Person> predicate = (person) -> person.getAge() > 65;

		System.out.println("using a predicate");
		displayPeople(people,predicate);
	}

	private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
		System.out.println("Selected: ");
		people.forEach(person ->{
			if (predicate.test(person)) {
				System.out.println(person.getPersonInfo());
			}
		});
		
	}

	private static void displayPeople(List<Person> people) {
		for(Person person : people) {
			if (person.getAge() > 65) {
			System.out.println(person.getPersonInfo());//invoke a default method
			}
		}
		
	}

}

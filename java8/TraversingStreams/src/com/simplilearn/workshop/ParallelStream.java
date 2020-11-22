package com.simplilearn.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.simplilearn.workshop.model.Person;

public class ParallelStream {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		
		Predicate<Person> older = (person)->person.getAge() >= 65;
		
		displayPeople(people,older);
	}

	private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
		
		System.out.println("selected :");
		/*
		 * people.forEach(person -> {
			if (predicate.test(person)) {
				System.out.println(person.getInfo());
			}
		});
		*/
		
		people.stream().parallel().filter(predicate).forEach(person->System.out.println(person.getInfo()));
		
	}

}

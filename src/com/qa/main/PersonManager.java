package com.qa.main;

import java.util.ArrayList;
import java.util.List;
	
public class PersonManager {
	List<Person> people=new ArrayList<>();
	
	public Person searchByName(String name) {
		for (Person person: people) {
			if (person.getName().equals(name)) {
				System.out.println("Person found!");
				return person;
			}
		break;
		}
		return null;
	}
	
	public void showAll() {
		for (Person person: people) {
			System.out.println(person.toString());
		}
	}

}

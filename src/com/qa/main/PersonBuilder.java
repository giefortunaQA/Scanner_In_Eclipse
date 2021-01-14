package com.qa.main;

import java.util.Scanner;

public class PersonBuilder {
	
	public Person build(Scanner input) {
		Person person=new Person();
		
		System.out.println("Enter your details.\nFull name:");
		person.setName(input.nextLine());
		
		System.out.println("Age:");
		int ageIn=Integer.parseInt(input.next());
		person.setAge(ageIn);
		
		System.out.println("Job Title:");
		person.setJobTitle(input.nextLine());
		
		return person;
	}
}

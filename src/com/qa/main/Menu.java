package com.qa.main;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		PersonManager pm=new PersonManager();
		Person person1=new Person("Nikita",24,"Dungeon Master");
		Person person2=new Person("Gie",22,"Chef");
		Person person3=new Person("Peter",23,"Doctor");
		Person person4=new Person("Peprah",23, "Lawyer");
		Person person5=new Person("Emmy",23,"Teacher");
		Person person6=new Person("Nick",25,"Trainer");
		pm.people.add(person1);
		pm.people.add(person2);
		pm.people.add(person3);
		pm.people.add(person4);
		pm.people.add(person5);
		pm.people.add(person6);
		
		Scanner menu=new Scanner(System.in);
		System.out.println("Choose an option:\n c: Add a person to directory \n o: Show all poeple in directory \n s: Search for a person by name");
		String in=menu.next();
		switch(in) {
		case "c":
			PersonBuilder p=new PersonBuilder();
			pm.people.add(p.build(menu));
			System.out.println("Your details have been added to the directory. Thank you.");
			break;
		case "o":
			pm.showAll();
			
			break;
		case "s":
			System.out.println("You are searching by name. \n Enter name:");
			pm.searchByName(menu.nextLine());

			break;
		default:
			System.out.println("Invalid command.");
		}
	menu.close();	
	}
}

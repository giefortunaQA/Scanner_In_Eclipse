package com.qa.main;

public class Runner {

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

	}

}

package com.qa.main;

public class Person {
	private String name;
	private int age;
	private String jobTitle;

	//Overloaded constructor
	public Person(String name, int age, String jobTitle) {
		this.name=name;
		this.age=age;
		this.jobTitle=jobTitle;
	}
	
	public Person() {}

	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", jobTitle=" + jobTitle;
	}
	
	//set and get
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	

}

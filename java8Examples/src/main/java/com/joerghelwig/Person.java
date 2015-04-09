package com.joerghelwig;

public class Person {
	
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.setName(name);
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + getName() + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	

}

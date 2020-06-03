package com.vominh.utilities.lambda;

import java.util.ArrayList;
import java.util.List;


public class FindObjectInList {
	public static void main(String args[]) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Minh"));
		list.add(new Person(2, "Long"));
		list.add(new Person(3, "Nam"));

		list.forEach(x -> System.out.println(x.name));
		
		System.out.println("##############");
		System.out.println(list.stream().findFirst().orElse(null).getName());
		System.out.println(list.stream().filter(x -> x.id == 2).findAny().orElse(null).name);
	}

}

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

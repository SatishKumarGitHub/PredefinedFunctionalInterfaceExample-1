package com.predefind.functional.interfaces;

public class Employee {

	private String name;

	public double salary;

	public Employee(String name, double salary) {

		this.salary = salary;
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return "Name : " + name + " salary : " + salary;
	}

}

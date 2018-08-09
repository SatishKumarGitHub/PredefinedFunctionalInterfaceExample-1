package com.predefind.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpSalaryCalculation {

	ArrayList<Employee> employees = new ArrayList<>();

	public ArrayList<Employee> setEmpDetails() {

		employees.add(new Employee("Mahesh", 12000d));
		employees.add(new Employee("Satish", 9670));
		employees.add(new Employee("Sonali", 56783));
		employees.add(new Employee("Sandeep", 89455));
		employees.add(new Employee("Shekhar", 13998));
		return employees;
	}
		Predicate<Employee> emp = e -> e.getSalary() < 15000;
		
		Function<Employee, Employee> empHike = e -> {
			e.salary = e.getSalary() + 1500.0;
			return e;
		};

	public static void main(String[] args) {

		EmpSalaryCalculation calculation = new EmpSalaryCalculation();
		ArrayList<Employee> employees = calculation.setEmpDetails();
		calculation.currentEmployeDeatils(employees);
		calculation.afterIncrementedEmpDeatils(employees);

	}

	private void afterIncrementedEmpDeatils(ArrayList<Employee> employees) {
		System.out.println("Incremented Emp salary whose salary less than 15000");
		ArrayList<Employee> incEmployees = new ArrayList<>();

		for (Employee employee : employees) {
			if (emp.test(employee)) {
				incEmployees.add(empHike.apply(employee));
			}
		}
		incEmployees.forEach(e -> System.out.println(e));
	}

	private void currentEmployeDeatils(ArrayList<Employee> employees) {
		System.out.println("Actually Salary of Employee");
		employees.forEach(e -> System.out.println(e));

	}

}

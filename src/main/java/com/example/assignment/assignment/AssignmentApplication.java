package com.example.assignment.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

//@SpringBootApplication
public class AssignmentApplication {
	public static <T> void swap(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void main(String[] args) {
		// Use HashSet to hold employee object
		HashSet<Employee> employees = new HashSet<>();
		employees.add(new Employee(1, "Anish", 20000, "HR"));
		employees.add(new Employee(2, "Anoop", 50000, "IT"));
		employees.add(new Employee(3, "Sayyam", 80000, "Service Now"));

		for (Employee employee : employees) {
			employee.displayDetails();
		}
		System.out.println("-------------------------------------------------------------");

		// HashMap with int keys and double values
		HashMap<Integer, Double> map = new HashMap<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int key = random.nextInt(100);
			double value = random.nextDouble(10);
			map.put(key, value);
		}

		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

		System.out.println("--------------------------------------------");
		Integer[] intArray = {1, 2, 3, 4, 5};
		System.out.println("Before swap: " + Arrays.toString(intArray));

		swap(intArray, 1, 3);
		System.out.println("After swap: " + Arrays.toString(intArray));

		String[] strArray = {"A", "B", "C", "D"};
		System.out.println("Before swap: " + Arrays.toString(strArray));

		swap(strArray, 0, 2);
		System.out.println("After swap: " + Arrays.toString(strArray));

		System.out.println("-----------------------------------------------");

		Pair<String, String> pair1 = new Pair<>("1", "Hello");
		System.out.println(pair1);

		Pair<String, java.util.Date> pair2 = new Pair<>("Today is ", new java.util.Date());
		System.out.println(pair2);
	}
}

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;

	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void displayDetails() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Pair{" +
				"key=" + key +
				", value=" + value +
				'}';
	}
}
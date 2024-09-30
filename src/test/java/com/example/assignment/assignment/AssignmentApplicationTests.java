package com.example.assignment.assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
class AssignmentApplicationTests {
	private HashSet<Employee> employees;
	private HashMap<Integer, Double> map;
	private Random random;

	@BeforeEach
	void setUp() {
		employees = new HashSet<>();
		employees.add(new Employee(1, "Anish", 20000, "HR"));
		employees.add(new Employee(2, "Anoop", 50000, "IT"));
		employees.add(new Employee(3, "Sayyam", 80000, "Service Now"));

		map = new HashMap<>();
		random = new Random();
		for (int i = 0; i < 10; i++) {
			int key = random.nextInt(100);
			double value = random.nextDouble(10);
			map.put(key, value);
		}
	}

	@Test
	void testEmployeeDetails() {
		assertEquals(3, employees.size());
		for (Employee employee : employees) {
			assertNotNull(employee.getName());
			assertTrue(employee.getSalary() > 0);
		}
	}

	@Test
	void testHashMapPopulation() {
		assertEquals(10, map.size());
		for (Integer key : map.keySet()) {
			assertTrue(key >= 0 && key < 100);
			assertTrue(map.get(key) >= 0 && map.get(key) < 10);
		}
	}

	@Test
	void testSwapIntegers() {
		Integer[] intArray = {1, 2, 3, 4, 5};
		AssignmentApplication.swap(intArray, 1, 3);
		assertArrayEquals(new Integer[]{1, 4, 3, 2, 5}, intArray);
	}

	@Test
	void testSwapStrings() {
		String[] strArray = {"A", "B", "C", "D"};
		AssignmentApplication.swap(strArray, 0, 2);
		assertArrayEquals(new String[]{"C", "B", "A", "D"}, strArray);
	}

	@Test
	void testPair() {
		Pair<String, String> pair1 = new Pair<>("1", "Hello");
		assertEquals("1", pair1.getKey());
		assertEquals("Hello", pair1.getValue());

		Pair<String, java.util.Date> pair2 = new Pair<>("Today is ", new java.util.Date());
		assertEquals("Today is ", pair2.getKey());
		assertNotNull(pair2.getValue());
	}
}


package com.example.assignment.assignment;

import org.junit.jupiter.api.*;

class LifecycleHooksTest {

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("@BeforeAll - Executes once before all test methods.");
    }

    @BeforeEach
    void setupBeforeEach() {
        System.out.println("@BeforeEach - Executes before each test method.");
    }

    @Test
    void test1() {
        System.out.println("Test1 execution.");
    }

    @Test
    void test2() {
        System.out.println("Test2 execution.");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("@AfterEach - Executes after each test method.");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll - Executes once after all test methods.");
    }
}


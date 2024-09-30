package com.example.assignment.assignment;

import java.util.Scanner;

public class DivisionHandler {
    public static int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            throw new UnsupportedOperationException("Cannot divide by zero", e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        try {
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("-------------------------------------------");
    }
}

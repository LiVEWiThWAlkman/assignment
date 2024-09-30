package com.example.assignment.assignment;

import java.util.Scanner;

public class Exception2 {
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new UnsupportedOperationException("Division by zero is not supported.");
        }
        return num1 / num2;
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
            System.out.println(e.getMessage());
        }
    }
}
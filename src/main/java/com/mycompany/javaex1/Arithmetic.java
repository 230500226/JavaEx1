/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex1;

/**
 *
 * @author ldxt460s
 */
import java.util.Scanner;
public class Arithmetic {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract two integers
    public int subtract(int a, int b) {
        return a -b;
    }

    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide two integers
    public int divide(int a, int b) {
        return a / b;
    }

    // Start the program
    public void start() {
        System.out.println("Enter the first integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the second integer");
        int b = scanner.nextInt();

        System.out.println("Enter the operation to perform");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(a, b));
                break;
            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;
            case 4:
                System.out.println("Result: " + divide(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
    
}

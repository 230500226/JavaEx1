/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaex1;

/**
 *
 * @author ldxt460s
 */

import java.util.Scanner;
public class JavaEx1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Enter you first integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the operation (+, -, *, /)");
        String operation = scanner.next();
        System.out.println("Enter you second integer");
        int b = scanner.nextInt();

        Arithmetic arithmetic = new Arithmetic();
        double result = 0;
        switch (operation) {
            case "+":
                result = arithmetic.add(a, b);
                break;
            case "-":
                result = arithmetic.subtract(a, b);
                break;
            case "*":
                result = arithmetic.multiply(a, b);
                break;
            case "/":
                result = arithmetic.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation");
        }

        System.out.printf("Result of %d and %d is = %.2f\n", a, b, result);

        scanner.close(); 
    }
}

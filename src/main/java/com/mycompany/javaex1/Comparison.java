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
public class Comparison {

    // Compare two integers
    public void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    // Start the program
    public void start() {
        System.out.println("Enter the first integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the second integer");
        int b = scanner.nextInt();

        compare(a, b);
        scanner.close();
    }

}

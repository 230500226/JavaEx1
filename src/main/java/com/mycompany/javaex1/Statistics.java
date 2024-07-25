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
public class Statistics {

 // Ask and get three intergers from the user
    public void start() {
        System.out.println("Enter the first integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the second integer");
        int b = scanner.nextInt();
        System.out.println("Enter the third integer");
        int c = scanner.nextInt();
        scanner.close();

        // Find the sum
        int sum = a + b + c;
        System.out.println("The sum is " + sum);

        // Find the average
        double average = (a + b + c) / 3.0;
        System.out.println("The average is " + average);

        // Find the product
        int product = a * b * c;
        System.out.println("The product is " + product);
        
        // Find the maximum
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The maximum is " + max);
        
        // Find the minimum
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The minimum is " + min);
        
    }
    
}

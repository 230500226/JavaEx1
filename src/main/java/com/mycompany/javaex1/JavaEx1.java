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
        System.out.println("Choose the program to run");
        System.out.println("1. Arithmetic Q1 press 1");
        System.out.println("2. Comparison Q2 press 2");
        System.out.println("3. Statistics Q3 press 3");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(); 

        switch (choice) {
            case 1:
                Arithmetic arithmetic = new Arithmetic();
                arithmetic.start();
                break;
            case 2:
 //               comparison();
                break;
            case 3:
//                statistics();
                break;
            default:
                System.out.println("Invalid choice");
        }


        scanner.close(); 
    }
}

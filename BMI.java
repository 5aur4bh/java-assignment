package com.assignment1;

import java.util.Scanner;
// 40. Implement a Java program to compute body mass index (BMI).
public class BMI {
    public static void main(String[] args) {
        System.out.println("Enter your weight in pounds ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Enter your height in inches");
        int height = sc.nextInt();
        double bmi = (weight / (height*height)) * 703.0;

        System.out.println("Your BMI is: "+bmi);
    }
}

package com.assignment1;

//import java.util.Scanner;

// 38. Implement a Java program that reads a number in inches, converts it to meters(CLA)
public class convertToMeters {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        double met = num * 0.0254;
        System.out.println("The answer in meter is: "+met);
    }
}

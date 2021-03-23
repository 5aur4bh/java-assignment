package com.assignment1;

import java.util.Scanner;

// 29. Implement a Java program to check a number is a cube or not.
public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        if((num == n * n * n))
            System.out.println("Number is a cube.");
        else
            System.out.print("Number is not a cube.");
    }
}

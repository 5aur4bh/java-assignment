package com.assignment1;

import java.util.Scanner;

//27. Implement a Java program to check two numbers are Amicable numbers or not.
public class amicableNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number= ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
                sum1 += i;
        }
        for (int i = 1; i <= b; i++)
        {
            if (b % i == 0)
                sum2 += i;
        }
        if (sum1 == sum2)
            System.out.println("The numbers are Amicable Number.");
        else
            System.out.println("The numbers are not Amicable Number");
    }
}

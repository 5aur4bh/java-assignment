package com.assignment1;

import java.util.Scanner;

// 50. Implement a java program to find the LCD of the given numbers.
public class LCD {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static void printSum(int num1, int den1, int num2, int den2) {
        int lcd = lcm(den1, den2);

        num1 *= (lcd / den1);
        num2 *= (lcd / den2);

        int res_num = num1 + num2;

        System.out.print( res_num + "/" + lcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first fraction as num/denom");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        System.out.println("Enter the second fraction as num/denom");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        printSum(num1, den1, num2, den2);
    }
}

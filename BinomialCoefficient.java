package com.assignment1;

import java.util.Scanner;

// 19 Implement a Java program to calculate the Binomial Coefficient of two positive numbers.
public class BinomialCoefficient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking in the form of nCk");
        System.out.println("Input n:");
        int n = sc.nextInt();
        System.out.println("Input k:");
        int k = sc.nextInt();

        int bi = fact(n) / (fact(k) * fact(n - k));

        System.out.println("The Binomial Coefficient of two positive number: "+bi);
    }

    private static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}

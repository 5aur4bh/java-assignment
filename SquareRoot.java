package com.assignment1;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%.3f\n", Math.sqrt(num)); //Print upto 3 decimal places
    }
}

package com.assignment1;

import java.util.Scanner;
//Finding Square root pf a number using newton-raphson method
public class SquareRootUsingNR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double d = num / 2;
        double temp;

        do {
            temp = d;
            d = (temp + (num/temp))/ 2; // N - R method
        } while ((temp-d)!=0);

        System.out.println(d);

    }
}

package com.assignment1;

import java.util.Scanner;

public class HalfAdder {
    //Implement half-adder using Bitwise Operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A^B;
        int carry =A&B;

        System.out.println("Sum is:" + sum);
        System.out.println("Carry is:" + carry);
    }
}

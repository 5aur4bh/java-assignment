package com.assignment1;

import java.util.Scanner;

//Find max min for given two numbers
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>B)
            System.out.println("The bigger number is: "+A);
        else
            System.out.println("The bigger number is: "+B);
    }
}

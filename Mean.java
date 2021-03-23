package com.assignment1;

import java.util.Scanner;

// 14. Implement a JAVA program to find the Mean of given 5 numbers
public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers to take their mean");
        int[] arr = new int[5];
        for(int i=0; i<5;i++)
             arr[i]= sc.nextInt();

        double mean, sum=0;
        for(int i=0; i<5;i++)
            sum = sum+ arr[i];

        mean = sum/5;

        System.out.println("Your mean is: "+mean);
    }
}

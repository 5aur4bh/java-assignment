package com.assignment1;

import java.util.Scanner;

// 44. Implement a java program to count the
// repeated occurrence of a digit in a n-digit number.
public class digit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the number you want to check frequency of");
        int n = sc.nextInt();
        int count =0;
        int temp = num;
        while(num>0){
            int d = num%10;
            if(n==d)
                count++;
            num= num/10;
        }
        System.out.println("The frequency of number "+temp+" is: "+count);
    }
}

package com.assignment1;

import java.util.Scanner;

// 22. Check whether the number is a palindrome number or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = rev(n);
        if(f==n)
            System.out.println("Your number is a palindrome number");
        else
            System.out.println("Your number is not a palindrome number");
    }

    private static int rev(int n) {
        int y = 0, x=0;
        while(n>0){
            x = n%10;
            y = y*10 + x;
            n=n/10;
        }
        return y;
    }
}

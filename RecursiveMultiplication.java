package com.assignment1;

import java.util.Scanner;

// 15. Implement a JAVA program to multiply two numbers using recursive multiplication.
public class RecursiveMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to take their multiplication");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int mul = recMulti(a,b);

        System.out.println("Your recursive multiplication is: "+ mul);
    }

    private static int recMulti(int a, int b) {
        if(a==0 || b==0)
            return 0;
        if(a==1)
            return b;
        if(b==1)
            return a;

        return recMulti(a-1, b) +b;
    }
}

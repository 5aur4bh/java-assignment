package com.assignment1;

import java.util.Scanner;

//23. Implement a Java program to check whether a number is a Harshad Number or not.
public class harshNum {
    static boolean checkHarsh(int n)
    {
        // calculate sum of digits
        int sum = 0;
        for (int temp = n; temp > 0; temp /= 10)
            sum += temp % 10;

        // Return true if sum of digits is multiple
        // of n
        return (n % sum == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkHarsh(n))
            System.out.println("Number is a Harshad Number");
        else
            System.out.println("Number is not a Harshad Number");
    }
}

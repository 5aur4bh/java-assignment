package com.assignment1;

import java.util.Scanner;
//24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.
public class pronNumber {
    static boolean checkPronic(int x)
    {
        for (int i = 0;i <= (int)(Math.sqrt(x)); i++)
            if (x == i * (i + 1))
                return true;

        return false;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPronic(n))
            System.out.println("Your number is a pronic number");
        else
            System.out.println("Your number is not a pronic number");
    }
}

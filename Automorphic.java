package com.assignment1;

import java.util.Scanner;
// 25. Implement a Java program check whether a number is an Automorphic number or not.
public class Automorphic {

    static boolean isAutomorphic(int num)
    {

        int square = num * num;
        while (num > 0)
        {
            if (num % 10 != square % 10)
                return false;
            num = num/10;
            square = square/10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAutomorphic(n))
            System.out.println("The number is automorphic");
        else
            System.out.println("The number is not automorphic");
    }
}
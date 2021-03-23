package com.assignment1;

import java.util.Scanner;

// 17. Find the power of the number without using existing methods.
public class powerNumber {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a = sc.nextInt();
        System.out.println("Enter its power");
        b = sc.nextInt();
        int pro=1;
        for(int i=b;i>0; i--){
            pro = pro*a;
        }
        System.out.println(pro);
    }
}

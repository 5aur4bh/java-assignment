package com.assignment1;

import java.util.Scanner;

// 16. Find the determinant, for the quadratic equations.
public class Determinant {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c of your quadratic equation");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Your quadratic equation is: "+a+"x^2+"+b+"x+"+c);
        //Determinant d = b^2 -4ac;
        int d = (b*b) - (4*a*c);
        System.out.println("Determinant of your quadratic equation is: "+d);

    }
}

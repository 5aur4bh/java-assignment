package com.assignment1;

// Implement a java program to find the area of
// a) Circle b) Rectangle
// c) Square d) trapezoid
//e)rhombus f) triangle

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        char choice;
        System.out.println("Enter your choice for \na) Circle \nb) Rectangle \nc) Square \nd) Trapezoid \ne) Rhombus " +
                "\nf) Triangle ");
        Scanner sc = new Scanner(System.in);
        choice = sc.next().charAt(0);
        switch (choice){
            case 'a':
                System.out.println("Enter the radius of the circle");
                int rad = sc.nextInt();
                double ar1 = 3.142*rad*rad;
                System.out.println("the area of the circle is: "+ ar1);
                break;
            case 'b':
                System.out.println("Enter the length of the Rectangle");
                int l = sc.nextInt();
                System.out.println("Enter the breadth of the Rectangle");
                int b = sc.nextInt();
                System.out.println("the area of the Rectangle is: "+ l*b);
                break;
            case 'c':
                System.out.println("Enter the side of the Square");
                int s = sc.nextInt();
                System.out.println("the area of the Rectangle is: "+ s*s);
                break;
            case 'd':
                System.out.println("Enter the two parallel sides for trapezoid");
                int b1 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println("Enter the height in the trapezoid");
                int h = sc.nextInt();
                int ar2 = h*((b1+b2)/2);
                System.out.println("The area of the trapezoid is: "+ar2);
                break;
            case 'e':
                System.out.println("Enter the two diagonal of the rhombus");
                int d1 = sc.nextInt();
                int d2 = sc.nextInt();
                System.out.println("The area of the rhombus is "+ (d1*d2)/2);
                break;
            case 'f':
                System.out.println("Enter the base and height of the triangle");
                int base = sc.nextInt();
                int height = sc.nextInt();
                System.out.println("The area of the triangle is "+ (base*height)/2);
                break;
            default:
               System.out.println("Enter the choices between a,b,c,d,e,f");
               break;
        }

    }
}

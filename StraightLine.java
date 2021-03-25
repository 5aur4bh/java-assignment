package com.assignment1;

import java.util.Scanner;
// 49. Implement a java program to find the straight line equation giving input m and c.
public class StraightLine {
    public static void main(String[] args) {
        System.out.println("Enter the value of m and c");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Your equation is y - "+m+"x = "+c);
    }
}

package com.assignment1;

import java.util.Scanner;

//17. Find the distance between two points, using euclidean distance.
public class euclideanDistance {
    public static void main(String[] args) {
        System.out.println("Enter the two points as x1,y1 and x2,y2");
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("The distance between two points, using euclidean distance is: "+d);
    }
}

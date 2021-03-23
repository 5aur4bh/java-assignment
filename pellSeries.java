package com.assignment1;
// 35. Implement a Java program to print the first 15 numbers of the Pell series.
public class pellSeries {
    public static void main(String[] args) {
        int n,x=1,y=0,z;
        System.out.println("First 15 Pell numbers: ");
        for(n=1; n<=15; n++)
        {
            z= x + 2*y;
            System.out.println(z+" ");
            x = y;
            y = z;
        }
    }
}

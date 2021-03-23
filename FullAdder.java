package com.assignment1;

import java.util.Scanner;

public class FullAdder {

    public static int[] halfAdder(int A, int B){
        int sum = A^B;
        int carry =A&B;

        int arr[]= {sum, carry};
        return  arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Cin = sc.nextInt();

        int[] s1 = halfAdder(A, B);
        int[] s = halfAdder(Cin, s1[0]);
        int sum = s[0];
        int cOut = s1[1] | s[1];

        System.out.println("Sum of full-adder is: "+sum);
        System.out.println("Carry generated is: "+cOut);
    }
}

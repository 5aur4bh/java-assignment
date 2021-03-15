package com.assignment1;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        //Find square of a number, can also use Math.pow function
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num*num);
    }
}

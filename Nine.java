package com.assignment1;

import java.util.Scanner;

//Find the number between 0 - 1000 where sum is 8
//Assuming sum of the digits is 8
public class Nine {
    public static void main(String[] args) {

        //int temp = 0, sum =0;
        for(int i=10; i<1000; i++) {
            int temp = 0, sum =0;
            while (i != 0) {
                temp = i % 10;
                sum = sum + temp;
                i = i / 10;
            }
            if(sum == 8) {
                System.out.println(sum);
            }
        }
    }
}

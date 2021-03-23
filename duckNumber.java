package com.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//27. Implement a Java program to check whether a number is a Duck Number or not

public class duckNumber {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Positive integer: ");
        int num = Math.abs(Integer.parseInt(br.readLine()));
        int c = 0;
        for(int i = num; i > 0; i /= 10){
            int d = i % 10;
            if(d == 0)
                c++;
        }
        if(c > 0)
            System.out.println(num + " is a duck number.");
        else
            System.out.println(num + " is not a duck number.");
    }
}

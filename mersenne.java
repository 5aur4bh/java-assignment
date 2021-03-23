package com.assignment1;

import java.util.Scanner;

// 33. Implement a program to check if a number is Mersenne number or not
public class mersenne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num=sc.nextInt();

        int checknum=num+1;
        int power=0;
        int flag=0;

        for(int i=0;;i++) {
            power= (int)Math.pow(2,i);
            if(power>checknum)
                break;

            else if(power==checknum) {
                System.out.println(num+" is a Mersenne number and it is 2^"+i+"-1");
                        flag=1;
            }
        }
        if(flag==0)
            System.out.println(num+" is not a Mersenne number.");
    }
}

package com.assignment1;

import java.util.Scanner;

public class armstrong<temp> {
    //Checking for an armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num;
        int sum = 0;

        while (t > 0){
            int s = t%10;
            double pro = Math.pow(s,3);
            sum = sum + (int) pro;
            t = t/10;
        }
        if(sum == num){
            System.out.println(num + " is an armstrong number");
        }
        else {
            System.out.println(num + " is not an armstrong number");
        }
    }
}

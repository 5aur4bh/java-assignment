package com.assignment1;
// 34. Implement a Java program to find all the narcissistic numbers between 1 and 1000.

public class Narcissistic {


    public static void main(String[] args) {
        for (int i=1; i<1000; i++){
            int num =i, s=0;
            while (num > 0) {
                int d = num % 10;
                int pro = (int) Math.pow(d,count(i));
                s = s+pro;
                num = num/10;
            }
            if(i == s)
                System.out.println(s);
        }
    }

    private static double count(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        return count;
    }
}
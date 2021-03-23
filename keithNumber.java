package com.assignment1;

import java.util.Scanner;

// 36. Implement a Program in Java to check whether a number is a Keith Number or not
public class keithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String input = sc.nextLine();

        if (input.length() > 1 && isKeithNumber(input))
            System.out.println(input + " is a Keith number!");
         else
            System.out.println(input + " is NOT a Keith number!");

        sc.close();

    }

    public static boolean isKeithNumber(String input) {
        int len = input.length();
        long[] series = new long[len];

        for (int i = 0; i < len; i++)
            series[i] = Long.valueOf(input.substring(i, i + 1));

        long next = 0;
        long number = Long.valueOf(input);

        while (next < number) {
            next = 0;
            for (int i = 0; i < len; i++) {
                next += series[i];
                if (i < len - 1)
                    series[i] = series[i + 1];
                else
                    series[i] = next;

            }
            if (next == number)
                return true;

        }
        return false;
    }
}

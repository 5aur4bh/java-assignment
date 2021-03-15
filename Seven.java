package com.assignment1;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        //Finding GCF - LCM of the given number
        int num1 , num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int hcf = 0;

        //Find HCF - GCF
        for(int i = 1; i<(num1 + num2); i++){
            if(num1 %i == 0 && num2 %i ==0)
                hcf = i;
        }

        System.out.println(hcf + " is the HCF");
        //FInding LCM
        int lcm = (num1*num2)/hcf;

        System.out.println(lcm + " is the LCM");


    }

}


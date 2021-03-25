package com.assignment1;

import java.util.Scanner;

/* 40. Implement a Java program to takes the user for a distance (in meters)
and the time was taken (as three numbers: hours, minutes, seconds),
and display the speed, in meters per second,
kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/
public class mph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your distance in meters");
        int distance = sc.nextInt();
        System.out.println("Enter your time in hours - minutes - second ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        int sec1 = hour*60 + min*60 + sec;

        double speed1 = (double) distance/sec1;
        double speed2 = (double) (distance/1000) / (hour + (double)(min/60));
        double miles =  (double) (distance/1000)* 1.609;
        double speed3 = (double) miles/(hour + (double)(min/60));

        System.out.println("Speed in meters per second: "+speed1);
        System.out.println("Speed in kilometers per hour: "+speed2);
        System.out.println("Speed in miles per hour: "+speed3);

    }
}

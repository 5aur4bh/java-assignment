package com.assignment1;

//Print ascii value from A-Z, a-z, 0-9
public class AsciiValue {
    public static void main(String[] args) {
        char ch;
        System.out.println("From A-Z");
        for(ch = 'A'; ch <= 'Z'; ch++)
            System.out.println((byte)ch);

        System.out.println("From a-z");

        for(ch='a'; ch<='z'; ch++)
            System.out.println((byte)ch);

        System.out.println("From 0-9");

        for(ch = '0'; ch<='9'; ch++)
            System.out.println((byte)ch);
    }
}
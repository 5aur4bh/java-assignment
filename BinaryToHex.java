package com.assignment1;

// 51. Find the hexadecimal equivalent for a given 4-digit binary number
public class BinaryToHex {

    int binaryToDecimal(long binary) {
        int decimalNumber = 0, i = 0;
        while (binary > 0) {
            decimalNumber += Math.pow(2, i++) * (binary % 10);
            binary /= 10;
        }
        return decimalNumber;
    }

    String decimalToHex(long binary) {

        int decimalNumber = binaryToDecimal(binary);
        String hexNumber = Integer.toHexString(decimalNumber);
        hexNumber = hexNumber.toUpperCase();

        return hexNumber;
    }

    public static void main(String[] args)
    {
        BinaryToHex ob = new BinaryToHex();
        long num = 10011110;

        System.out.println("Inputted number : " +num);
        System.out.println(ob.decimalToHex(10011110));
    }
}

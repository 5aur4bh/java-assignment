package com.assignment1;

public class checkDefault {
    //These cannot be initialised in main due to presence od word "static"
    //ALso now they act as property of the object of the class.
    int num;
    float fl;
    char ch;
    boolean bl;
    String str;
    double db;
    byte b;
    long l;

    public static void main(String[] args) {

        checkDefault check = new checkDefault();

        System.out.println(check.num); // 0
        System.out.println(check.fl); //0.0
        System.out.println(check.ch); //
        System.out.println(check.bl); //false
        System.out.println(check.str); //null
        System.out.println(check.db); //0.0
        System.out.println(check.b); //0
    }


}

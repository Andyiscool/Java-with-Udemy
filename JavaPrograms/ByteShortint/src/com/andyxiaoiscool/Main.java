package com.andyxiaoiscool;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 127;
        short myShortValue = 12345;
        int intValue = 50;

        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + intValue);
        short myShortTotal = (short) (1000 + 10 + (myByteValue + myShortValue + intValue));
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myShortValue = " + myShortValue);



    }
}

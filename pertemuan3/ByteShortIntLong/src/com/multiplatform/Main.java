package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMaxIntValue = Integer.MAX_VALUE;
	    int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Overflow = " + (myMaxIntValue + 1));
        System.out.println("Underflow = " + (myMinIntValue - 1));

        int maxValue = 2_147_483_647; // hanya untuk memudahkan membaca

        //byte, short, long
    }
}

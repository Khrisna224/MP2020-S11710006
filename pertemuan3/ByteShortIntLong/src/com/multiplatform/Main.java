package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMaxIntValue = Integer.MAX_VALUE;
	    int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Int\nInteger Maximum value = " + myMaxIntValue);
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Overflow = " + (myMaxIntValue + 1));
        System.out.println("Underflow = " + (myMinIntValue - 1));

        int maxValue = 2_147_483_647; // hanya untuk memudahkan membaca


        //assignment
        //cari nilai min & max dari tipe data byte, short, long

        //Byte
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("\nByte\nbyte Maximum value = " + myMaxByteValue);
        System.out.println("byte Minimum value = " + myMinByteValue);
        System.out.println("Overflow = " + (myMaxByteValue + 1));
        System.out.println("Underflow = " + (myMinIntValue - 1));
        
        //Short
        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("\nShort\nshort Maximum value = " + myMaxShortValue);
        System.out.println("short Minimum value = " + myMinShortValue);
        System.out.println("Overflow = " + (myMaxShortValue + 1));
        System.out.println("Underflow = " + (myMinIntValue - 1));

        //Long
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("\nLong\nlong Maximum value = " + myMaxLongValue);
        System.out.println("long Minimum value = " + myMinLongValue);
        System.out.println("Overflow = " + (myMaxLongValue + 1));
        System.out.println("Underflow = " + (myMinIntValue - 1));

        long myBigLongValue = 2_147_483_647_234L;

        //Type Casting
        int myNewIntValue = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}

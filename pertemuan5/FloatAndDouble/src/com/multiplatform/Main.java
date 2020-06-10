package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);

        int myIntegerNumber = 5 / 3;
        float myFloatNumber = 5f / 3f;      //single precision 7 angka blakang koma
        double myDoubleNumber = 5d / 3d; //default double   //double precision 14 angka blakang koma
        System.out.println(myIntegerNumber);
        System.out.println(myFloatNumber);
        System.out.println(myDoubleNumber);
    }
}

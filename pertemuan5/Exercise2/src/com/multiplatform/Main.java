package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    //Exercise
        int pound = 11;
	    double kg = 0.45359237d;
        System.out.println(pound + " Pound = " +(pound*kg) + " kg");
        System.out.println("Dibulatkan = "+String.format("%,.2f",pound*kg) + " kg");
    }
}

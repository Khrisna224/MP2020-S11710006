package com.multiplatform;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Exercise
        int pound = 11;
	    double kg = 0.45359237d;
        System.out.println(pound + " Pound = " +(pound*kg) + " kg");
        System.out.println("Dibulatkan = "+String.format("%,.2f",pound*kg) + " kg");


        //Experiment
        Scanner inputInteger = new Scanner(System.in);
        System.out.print("\n\nInput Pound = ");
        int pound2 = inputInteger.nextInt();
        System.out.println(pound + " Pound = " +(pound2*kg) + " kg");
        System.out.println("Integer = " + ((int)(pound2*kg)) + " kg");
        System.out.println("Integer = " + String.format("%,.0f",pound2*kg) + " kg");
    }
}

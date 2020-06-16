package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	//write your code here
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){                                // if not valid
            System.out.println("Invalid Value");
            return;
        }
        long dayCalc = 60 * 24;                         // minute to days
        long yearCalc = dayCalc * 365;                  // minute to years
        long years = minutes/yearCalc;                  // calc minute to year
        long yearLeft = minutes%yearCalc;               // minute remaining
        long days = yearLeft/dayCalc;                   // calc minute remaining to days
        System.out.println(minutes + " min = "+ years + " y and " + days + " d");
    }
}
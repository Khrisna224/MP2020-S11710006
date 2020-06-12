package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // 1
        System.out.println("Number 1\nValid : " + toMilesPerHour(75.114));
        System.out.println("Invalid : " + toMilesPerHour(-5.6));

        //2
        System.out.println("\nNumber 2");
        printConversion(-1);
        printConversion(75.114);
    }

    public static int toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return ((int)(Math.round((kilometersPerHour / 1.60934))));

    }
    public static void printConversion(double kilometersPerHour){
        // print a message in the format "XX km/h = YY mi/h".
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
            return;
        }

        //cara 1
        System.out.println(kilometersPerHour + " km/h = " + (Math.round((kilometersPerHour / 1.60934))) + " mi/h");

        //cara 2
        System.out.println(kilometersPerHour + " km/h = " + String.format("%,.0f",kilometersPerHour / 1.60934) + " mi/h");
    }

    

    /*
    public static int toMilesPerHour(double kilometersPerHour){
        int milesPerHour;
        if(kilometersPerHour < 0){
            return -1;
        }
        return ((int)(Math.round(kilometersPerHour * 0.621371)));
    }
    public static void printConversion(double kilometersPerHour){
        // print a message in the format "XX km/h = YY mi/h".
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
            return;
        }

        //cara 1
        System.out.println(kilometersPerHour + " km/h = " + (Math.round(kilometersPerHour * 0.621371)) + " mi/h");

        //cara 2
        System.out.println(kilometersPerHour + " km/h = " + String.format("%,.0f",kilometersPerHour * 0.621371) + " mi/h");
    }
    */
}

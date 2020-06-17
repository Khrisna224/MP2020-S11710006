package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // No 1
        System.out.println("No 1");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        // No 2
        System.out.println("\nNo 2");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean shouldWakeUp(boolean banking, int hourOfDay){
        if ((hourOfDay < 0 || hourOfDay > 23) || banking == false ) return false;
        else if (hourOfDay < 8 || hourOfDay > 22) return true;
        else return false;
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            if (temperature > 25 && temperature <= 45) return true;
            else return false;
        }
        else{
            if (temperature > 25 && temperature <= 35) return true;
            else return false;
        }
    }
}

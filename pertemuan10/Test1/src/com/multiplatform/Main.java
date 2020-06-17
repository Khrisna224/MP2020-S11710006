package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // No 1
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

    }
    public static boolean shouldWakeUp(boolean banking, int hourOfDay){
        if ((hourOfDay < 0 && hourOfDay > 23) || banking == false ) return false;
        if (hourOfDay < 8 || hourOfDay > 22) return true;
        return false;
    }
}

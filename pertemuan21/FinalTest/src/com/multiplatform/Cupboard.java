package com.multiplatform;

public class Cupboard {
    private int length,width;

    public Cupboard(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void CupboardSize(){
        System.out.println("Cupboard length = " + length + " width = "+ width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

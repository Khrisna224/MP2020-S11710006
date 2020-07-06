package com.multiplatform;

public class Bed {
    private int length,width;

    public Bed(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void bedSize(){
        System.out.println("Bed length = " + length + " width = "+ width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

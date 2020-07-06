package com.multiplatform;

public class Chair {
    private int length,width;

    public Chair(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void chairSize(){
        System.out.println("Chair length = " + length + " width = "+ width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

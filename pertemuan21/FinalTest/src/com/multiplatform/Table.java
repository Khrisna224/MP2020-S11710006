package com.multiplatform;

public class Table {
    private int length,width;

    public Table(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void tableSize(){
        System.out.println("Table length = " + length + " width = "+ width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

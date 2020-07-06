package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room myBedroom = new Room(new Bed(500,200),new Table(100,100),new Chair(50,50),new Cupboard(100,300));
        myBedroom.content();
    }
}


package com.multiplatform;

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double height) {
        super(width,length);
        this.height = Math.max(height,0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }
}


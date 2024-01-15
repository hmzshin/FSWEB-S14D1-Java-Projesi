package com.s14d1.pool;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        if (height < 0) {
            System.out.println("Height can not be less then zero. Default set to zero.");
            this.height = 0;
        } else {
            this.height = height;
        }
    }


    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * super.getArea();
    }
}

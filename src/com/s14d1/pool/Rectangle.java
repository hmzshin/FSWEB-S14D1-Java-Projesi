package com.s14d1.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            System.out.println("Width can not be less then zero. Default set to zero.");
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            System.out.println("Height can not be less then zero. Default set to zero.");
            this.length = 0;
        } else {
            this.length = length;
        }

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}

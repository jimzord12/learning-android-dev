package com.example.lib.shapes;

public class Circle implements Shape{


    @Override
    public double calculateParameter(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateParameter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculateVolume(double radius) {
        return 2 * Math.PI * radius;
    }
}

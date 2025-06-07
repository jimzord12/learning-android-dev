package com.example.lib.exercise01;

public class Circle extends AbstractCircle{
    double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    double calcParameter() {
        return 2 * Math.PI * this.radius;
    }
    double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

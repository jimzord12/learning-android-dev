package com.example.lib;

public abstract  class Vehicle implements IVechile {
    int makeYear;
    String model;
    String color;
    int speed;

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public Vehicle(int makeYear, String model, String color, int speed) {
        this.makeYear = makeYear;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    abstract public void accelerate(int speed);

    abstract public void brake(int speed);

}

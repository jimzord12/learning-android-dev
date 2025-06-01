package com.example.lib;


public class Car extends Vehicle {

    public Car(int makeYear, String model, String color, int speed) {
        super(makeYear, model, color, speed);
    }

    /**
     * @param speed The Vehicle's current speed
     */
    @Override
    public void accelerate(int speed) {
        int newSpeed = this.getSpeed() + speed;
        this.setSpeed(newSpeed);
        System.out.println("The car is accelerating | New speed: " + newSpeed);
    }

    /**
     * @param speed The Vehicle's current speed
     */
    @Override
    public void brake(int speed) {
        int newSpeed = this.getSpeed() - speed;
        this.setSpeed(newSpeed);
        System.out.println("The car is braking | New speed: " + newSpeed);

    }
}

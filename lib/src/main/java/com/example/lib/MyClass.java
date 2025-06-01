package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        Car car1 = new Car(2022, "Toyota", "Camry", 200);
        car1.accelerate(50);
        car1.accelerate(520);
        car1.brake(250);
        car1.brake(350);
        car1.accelerate(500);
    }
}
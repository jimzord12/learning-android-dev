package com.example.lib.exercise01;

public class Main {

    public static void main(String[] args) {
        InputController inputController = new InputController();

        int radius  = inputController.getInt("Please enter the radius of the circle: ");

        Circle circle = new Circle(radius);

        System.out.println("The area of the circle is: " + circle.calcArea());
        System.out.println("The parameter of the circle is: " + circle.calcParameter());

    }
}

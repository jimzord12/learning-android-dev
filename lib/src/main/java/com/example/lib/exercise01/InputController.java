package com.example.lib.exercise01;

import java.util.Scanner;

public class InputController {

    Scanner scanner = new Scanner(System.in);

    int getInt(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }
    boolean getBool(String msg) {
        System.out.println(msg);
        return scanner.nextBoolean();
    }
}

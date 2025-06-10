package com.example.lib.scanner;

import java.util.Scanner;

public class ScannerHelpers {
    Scanner scanner = new Scanner(System.in);

    public int getInt(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }
    boolean getBool(String msg) {
        System.out.println(msg);
        return scanner.nextBoolean();
    }

    public String getString(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }
}

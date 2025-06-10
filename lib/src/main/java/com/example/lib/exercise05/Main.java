package com.example.lib.exercise05;

import com.example.lib.scanner.ScannerHelpers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ScannerHelpers inputController = new ScannerHelpers();

        String str = "1234567890";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        char[] charArray = str.toCharArray();
        Character[] cArr = new Character[charArray.length];

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }



    }
}

package com.example.lib.exercise04;

import com.example.lib.exercise01.Circle;
import com.example.lib.scanner.ScannerHelpers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ScannerHelpers inputController = new ScannerHelpers();

        String str = inputController.getString("Please enter a string: ");
        char[] charArray = str.toCharArray();
        Character[] cArr = new Character[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            cArr[i] = charArray[i];
        }


        Map<Character, Integer> memo = new HashMap<>();
        for (Character c : cArr) {
            memo.merge(c, 1, Integer::sum);
        }

        Set<Character> noDupes = new HashSet<>(List.of(cArr));
        for (Character c : noDupes) {
            System.out.println(c + " " + memo.get(c));
        }


    }
}

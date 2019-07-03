package com.hsbc.recruitment;

public class Main {
    public static void main(String[] args) {
        BracketChecker bracketChecker = new BracketChecker("()");
        boolean result = bracketChecker.areBracketsMatchedAndNestedCorrectly();
        System.out.println(result);
    }
}

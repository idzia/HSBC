package com.hsbc.recruitment;

public class Main {
    public static void main(String[] args) {
        BracketChecker bracketChecker = new BracketChecker("()");
        boolean result = bracketChecker.areBracketsMatchedAndNestedCorrectly();

        Scrabble sc = new Scrabble("cabbage");
        System.out.println(sc.getScore());
    }
}

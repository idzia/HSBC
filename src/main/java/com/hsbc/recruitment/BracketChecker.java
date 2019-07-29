package com.hsbc.recruitment;

import java.util.Stack;

public class BracketChecker {
    private String bracketString;

    public BracketChecker(String bracketString) {
        this.bracketString = bracketString;
    }

    public boolean areBracketsMatchedAndNestedCorrectly () {
        if (bracketString == null
                || bracketString.length()<2
                || bracketString.length()%2 != 0
                || bracketString.charAt(0)==')'
                || bracketString.charAt(0)=='}'
                || bracketString.charAt(0)==']') {
            return false;
        }

        Stack<String> stack = new Stack<>();
        String[] bracketArr = bracketString.split("");

        for (String bracket : bracketArr) {
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                stack.push(bracket);
            } else if (bracket.equals(")")) {
                if (!stack.pop().equals("(")) {
                    return false;
                }
            } else if (bracket.equals("]")) {
                if (!stack.pop().equals("[")) {
                    return false;
                }
            } else if (bracket.equals("}")) {
                if (!stack.pop().equals("{")) {
                    return false;
                }
            }
        }
        return true;
    }

}

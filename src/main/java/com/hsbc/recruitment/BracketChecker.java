package com.hsbc.recruitment;

public class BracketChecker {
    private String bracketString = "";

    public BracketChecker(String bracketString) {
        this.bracketString = bracketString;
    }
    public boolean areBracketsMatchedAndNestedCorrectly () {

        if (bracketString.contains("{}")) {
            bracketString.replaceAll("\\{}","");

        } else if (bracketString.contains("[]")) {
            bracketString.replaceAll("\\[]", "");

        } else if (bracketString.contains("()")) {
            bracketString.replaceAll("()","");
        }

        return true;
    }

}

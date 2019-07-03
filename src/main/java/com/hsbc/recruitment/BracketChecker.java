package com.hsbc.recruitment;

public class BracketChecker {
    private String bracketString = "";

    public BracketChecker(String bracketString) {
        this.bracketString = bracketString;
    }
    public boolean areBracketsMatchedAndNestedCorrectly () {

        boolean result = true;

        while (bracketString.contains("{}") == true || bracketString.contains("[]") == true || bracketString.contains("()")== true) {
            bracketString.replaceAll("\\{}","");
            bracketString.replaceAll("\\[]", "");
            bracketString.replaceAll("()","");
        }

        if (bracketString.length() > 0) {
            result = false;
        }


        return result;
    }

}

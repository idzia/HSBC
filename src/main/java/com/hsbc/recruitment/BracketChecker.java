package com.hsbc.recruitment;

public class BracketChecker {
    private String bracketString = "";

    public BracketChecker(String bracketString) {
        this.bracketString = bracketString;
    }

    public boolean areBracketsMatchedAndNestedCorrectly () {

        boolean result = true;
        String bracketStr = null;

        if (bracketString.contains("{}") == true || bracketString.contains("[]") == true || bracketString.contains("()")== true) {

            bracketStr = bracketString.replaceAll("{}", "").replaceAll("[]","").replaceAll("()", "");
        }

        if (bracketStr!=null && bracketStr.length() > 0) {
            result = false;
        }

        return result;
    }

}

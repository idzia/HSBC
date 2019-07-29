package com.hsbc.recruitment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    private String word;

    public Scrabble(String word) {
        this.word = word;
    }


    public int getScore() {
        int score = 0;

        String [] wordArr = word.split("");
        for (String letter : wordArr) {
            if (letterMap.get(letter.toUpperCase()) != null) {
                score += letterMap.get(letter.toUpperCase());
            }
        }

        return score;
    }

    public int getStreamScore() {
        return Arrays.stream(word.split("")).map(item -> letterMap.get(item.toUpperCase())).reduce(0,(a, b) -> a+b);
    }

    static Map<String, Integer> letterMap = new HashMap<>();

        static {
            letterMap.put("A",1);
            letterMap.put("E",1);
            letterMap.put("I",1);
            letterMap.put("O",1);
            letterMap.put("U",1);
            letterMap.put("L",1);
            letterMap.put("N",1);
            letterMap.put("R",1);
            letterMap.put("S",1);
            letterMap.put("T",1);

            letterMap.put("D",2);
            letterMap.put("G",2);

            letterMap.put("B",3);
            letterMap.put("C",3);
            letterMap.put("M",3);
            letterMap.put("P",3);
            letterMap.put("F",4);
            letterMap.put("H",4);
            letterMap.put("V",4);
            letterMap.put("W",4);
            letterMap.put("Y",4);

            letterMap.put("K",5);

            letterMap.put("J",8);
            letterMap.put("X",8);

            letterMap.put("Q",10);
            letterMap.put("Z",10);
        }
}

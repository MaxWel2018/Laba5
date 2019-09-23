package edu;

public class Phrase {
    private String value="";

    public void addValue(Word word) {
        if (word != null) {

            value += " " + word.getValue();
        }
    }

    public String getValue() {
        return value;
    }
}
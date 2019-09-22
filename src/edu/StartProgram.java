package edu;

public class StartProgram {
    public static void main(String[] args) {
        Word word = new Word("This is Header ");
        Text text = new Text(word);

        Word word1 = new Word("some text");
        Word word2 = new Word("some text1");
        Word word3 = new Word("some text2");
        Word word4 = new Word("some text3");

        Phrase phrase = new Phrase();

        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);
        phrase.addValue(word4);

        text.addBody(phrase);

        System.out.println("Head: " + text.getHeader());

        System.out.println("Body: " + text.getBody());

    }
}
package edu;

import java.util.Objects;

public class Text {
    private String header;
    private String body = "";

    Text(Word word) {
        if (word != null)
            header = word.getValue();
        else
            header = "";
    }

    Text(Phrase phrase) {
        if (phrase != null)
            header = phrase.getValue();
        else
            header = "";
    }

    String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getValue();
    }


    void addBody(Phrase phrase) {
        body += " " + phrase.getValue();
    }

    String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return header.equals(text.header) &&
                body.equals(text.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body);
    }
}
package edu;

import java.util.Objects;

public class Word {
    private String value;

    public Word(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        if (word.value != null && this.value != null)
            return value.equals(word.value);
         else return word.value == null && this.value == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
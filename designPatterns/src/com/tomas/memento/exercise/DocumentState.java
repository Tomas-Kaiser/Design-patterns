package com.tomas.memento.exercise;

public class DocumentState {
    private final String content;
    private final String fontName;
    private final int size;

    public DocumentState(String content, String fontName, int size) {
        this.content = content;
        this.fontName = fontName;
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getSize() {
        return size;
    }
}

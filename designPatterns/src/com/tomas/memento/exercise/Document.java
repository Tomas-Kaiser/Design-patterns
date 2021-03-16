package com.tomas.memento.exercise;

public class Document {
    private String content;
    private String fontName;
    private int size;

    public DocumentState craeteDocumentState() {
        return new DocumentState(content, fontName, size);
    }

    public void restore(DocumentState state) {
        content = state.getContent();
        fontName = state.getFontName();
        size = state.getSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

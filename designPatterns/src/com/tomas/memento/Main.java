package com.tomas.memento;

import com.tomas.memento.exercise.Document;
import com.tomas.memento.exercise.DocumentState;
import com.tomas.memento.exercise.History;


public class Main {
    //    Memento pattern
    public static void main(String[] args) {
        var document = new Document();
        var history = new History();
        document.setContent("Hello content A");
        document.setFontName("Arial");
        document.setSize(12);
        history.push(document.craeteDocumentState());

        document.setContent("Hello content B");
        document.setFontName("Arial B");
        document.setSize(14);
        history.push(document.craeteDocumentState());

        document.restore(history.pop());
        document.restore(history.pop());



        System.out.println(document.getContent());
        System.out.println(document.getFontName());
        System.out.println(document.getSize());


//        var editor = new Editor();
//        var history = new History();
//
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());
    }
}

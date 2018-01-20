package com.kodilla.stream.beautifier;

import com.sun.org.apache.xpath.internal.SourceTree;

public class PoemBeautifier {
    public void beutify(String textToBeautify, PoemDecorator poemDecorator){
        String textAfterModification = poemDecorator.decorate(textToBeautify);
        System.out.println("Text before: " + textToBeautify + "  Text after: " + textAfterModification);
    }
}

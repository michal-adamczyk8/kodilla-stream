package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.referance.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beutify("Michał Adamczyk", (textToBeautify -> "ABC" + textToBeautify + "ABC"));
        poemBeautifier.beutify("Michał Adamczyk", textToBeautify -> textToBeautify.toUpperCase());
        poemBeautifier.beutify("Michał Adamczyk", textToBeautify -> textToBeautify.toLowerCase());
        poemBeautifier.beutify("Michał Adamczyk", textToBeautify -> "Imię: " + textToBeautify.substring(0, textToBeautify.indexOf(" "))+ " Nazwisko: " + textToBeautify.substring(textToBeautify.indexOf(" ") + 1,textToBeautify.length()));
        poemBeautifier.beutify(("Michał Adamczyk"), textToBeautify -> new StringBuilder(textToBeautify).reverse().toString());
    }
}

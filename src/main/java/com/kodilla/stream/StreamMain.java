package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
       /* PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beutify("Michał Adamczyk", (textToBeautify -> "ABC" + textToBeautify + "ABC"));
        poemBeautifier.beutify("Michał Adamczyk", textToBeautify -> textToBeautify.toUpperCase());
        poemBeautifier.beutify("Michał Adamczyk", textToBeautify -> textToBeautify.toLowerCase());
        poemBeautifier.beutify("Michał Adamczyk", textToBeautify -> "Imię: " + textToBeautify.substring(0, textToBeautify.indexOf(" "))+ " Nazwisko: " + textToBeautify.substring(textToBeautify.indexOf(" ") + 1,textToBeautify.length()));
        poemBeautifier.beutify(("Michał Adamczyk"), textToBeautify -> new StringBuilder(textToBeautify).reverse().toString());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        Forum forum = new Forum();
        Map<Integer, ForumUser> theMapOfResults = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() > 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        theMapOfResults.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ": " + integerForumUserEntry.getValue())
                .forEach(System.out::println);
       }
}

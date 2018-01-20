package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList= new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "Bon Scott", 'M', 1987,03,26,45));
        userList.add(new ForumUser(2,"Angus Young",'M', 1956, 12,04, 18));
        userList.add(new ForumUser(3, "Stevie Nicks", 'F', 1948, 05, 26, 178));
        userList.add(new ForumUser(4, "Alison Moshart", 'F', 1978, 11, 23, 4));
        userList.add(new ForumUser(5,"Saul Hudson", 'M', 1965, 07,23, 89 ));
        userList.add(new ForumUser(6, "Micheal Balzary",'M', 1962, 10, 16,999 ));
        userList.add(new ForumUser(7, "Anthony Kiedies", 'M', 1962, 11, 1, 56));
        userList.add(new ForumUser(8, "Debbie Harry", 'F', 1945, 07, 01, 0));
        userList.add(new ForumUser(9,"Meechy Darko", 'M', 1990, 12, 27, 123));
        userList.add(new ForumUser(10, "Kendrick Duckworth", 'M', 1987, 06, 15,87));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}

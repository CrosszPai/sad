package com.solid.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;


// a book is many pages object
public class Book extends Pages {
    public Book(String title, List<String> pages) {
        super(title, pages);
    }
}

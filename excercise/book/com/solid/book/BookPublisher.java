package com.solid.book;


import java.util.List;

public class BookPublisher extends Publisher {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        BookPublisher bp = new BookPublisher();
        bp.printToFile(book);
    }
}

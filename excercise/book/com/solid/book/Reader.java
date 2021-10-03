package com.solid.book;

// this can read something has many pages
public class Reader {
  public void printToScreen(Pages pages) {
        do {
            System.out.println(pages.getCurrentPage());
        } while (pages.turnToNextPage());
    }
}

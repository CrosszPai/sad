package com.solid.book;

import java.util.List;
import java.util.ListIterator;

// just something has many page and can interact with those pages.
public class Pages {

  private String title;
  private List<String> pages;
  private ListIterator<String> iterator;
  private String currentPage;

  public Pages(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

  public String getTitle() {
    return title;
  }

  public String getCurrentPage() {
    return currentPage;
  }

  public boolean turnToNextPage() {
    if (iterator.hasNext()) {
      currentPage = iterator.next();
      return true;
    } else {
      return false;
    }
  }
}

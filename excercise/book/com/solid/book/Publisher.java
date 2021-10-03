package com.solid.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// this can publish something has many pages
public class Publisher {
    public void  printToFile(Pages pages) {
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(pages.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = pages.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, pages.getCurrentPage());
                    isEven = true;
                }
            } while (pages.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }

}
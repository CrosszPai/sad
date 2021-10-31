package com.company;

import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public class AlphabetSubscriber extends  StringSubscriber{
    static final Pattern pattern = Pattern.compile("[a-zA-Z]+");
    static final String fileName = "AlphabetSubscriber.txt";

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}

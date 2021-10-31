package com.company;

import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public class NumberSubscriber extends StringSubscriber{
    static final Pattern pattern = Pattern.compile("\\d+");
    static final String fileName = "NumberSubscriber.txt";

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}

package com.company;

import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public class SymbolSubscriber extends  StringSubscriber{
    final static Pattern pattern = Pattern.compile("\\W+");
    final static String fileName = "SymbolSubscriber.txt";

    @Override
    public Pattern getPattern() {
        return  pattern;
    }

    @Override
    public String getFileName() {
        return  fileName;
    }
}

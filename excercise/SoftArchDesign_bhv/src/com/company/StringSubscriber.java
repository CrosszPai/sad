package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public abstract class StringSubscriber implements Flow.Subscriber<String> {
    protected Flow.Subscription subscription;
    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }

    @Override
    public void onNext(String item) {
        try {
            File file = new File(getFileName());
            if(!file.exists()){
                if(!file.createNewFile()){
                    System.err.println("File creation failed");
                }
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(item);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        subscription.request(1);
    }

    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    public abstract Pattern getPattern();
    public abstract String getFileName();

}

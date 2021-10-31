package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.regex.Matcher;

public class StringPublisher implements Flow.Publisher<String> {
    List<StringSubscriber> subscribers;
    StringSubscription subscription;
    public StringPublisher() {
        this.subscribers = new ArrayList<>();
        this.subscription = new StringSubscription();
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        subscriber.onSubscribe(subscription);
        this.subscribers.add((StringSubscriber) subscriber);
    }

    public void publish(String message) {
        for (StringSubscriber subscriber : subscribers) {
            final Matcher matcher = subscriber.getPattern().matcher(message);
            while (matcher.find()) {
                System.out.print("Found match: " + matcher.group());
                System.out.println(" Publish to " + subscriber.getClass().getName());
                subscriber.onNext(matcher.group());
            }
        }

    }
}

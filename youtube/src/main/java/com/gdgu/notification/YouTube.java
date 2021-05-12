package com.gdgu.notification;

public class YouTube {
    public static void main(String args[]) {
        Channel channel1 = new ChannelCollImpl("Let's Code");

        Subscriber s1 = new SubscriberImpl("Alex");
        Subscriber s2 = new SubscriberImpl("Sam");
        Subscriber s3 = new SubscriberImpl("Alice");

        channel1.uploadVideo("Introduction");

        channel1.subscribe(s1);
        channel1.subscribe(s2);
        channel1.subscribe(s3);

        channel1.uploadVideo("OPPs Concept");
        channel1.unSubscribe(s2);

        channel1.uploadVideo("Java Fundamentals");
    }
}

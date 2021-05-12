package com.gdgu.notification;

public class SubscriberImpl implements Subscriber{

    private String subscriberName;
    private String channelName;
    private String videoTitle;

    public SubscriberImpl(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateSubscriber(String channelName, String videoTile) {
        this.channelName = channelName;
        this.videoTitle = videoTile;
        displayUpdate();
    }

    @Override
    public void displayUpdate() {
        System.out.println("Hey " + subscriberName + ",\n" + channelName + " has uploaded a new video: " + videoTitle);
    }
    
}

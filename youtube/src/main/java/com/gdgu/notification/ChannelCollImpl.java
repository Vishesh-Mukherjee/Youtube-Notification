package com.gdgu.notification;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollImpl implements Channel{

    private String channelName;
    private String videoTitle;
    private List<Subscriber> subscriberList;

    public List<Subscriber> getSubscriberList() {
        return this.subscriberList;
    }

    public ChannelCollImpl(String channelName) {
        this.channelName = channelName;
        subscriberList = new ArrayList<Subscriber>();
    } 

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        int i = subscriberList.indexOf(subscriber);
        if (i >= 0) {
            subscriberList.remove(i);
        }
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber i: subscriberList) {
            i.updateSubscriber(this.channelName, this.videoTitle);
        }
    }

    @Override
    public void uploadVideo(String videoTitle) {
        this.videoTitle = videoTitle;
        notifySubscriber();
    }
    
}

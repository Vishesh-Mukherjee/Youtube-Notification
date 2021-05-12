package com.gdgu.notification;

public interface Channel {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscriber();
    void uploadVideo(String videoTitle);
}

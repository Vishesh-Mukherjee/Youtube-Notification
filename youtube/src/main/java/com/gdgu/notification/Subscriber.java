package com.gdgu.notification;

public interface Subscriber {
    void updateSubscriber(String channelName, String videoTile);
    void displayUpdate();
}

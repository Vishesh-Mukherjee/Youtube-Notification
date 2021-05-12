package com.gdgu.notification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChannelCollImplTest {
    ChannelCollImpl testObj;

    @BeforeEach
    private void setup() {
        testObj = new ChannelCollImpl("Testing Channel");
    }

    @Test
    public void subscribeTest() {
        Assertions.assertTrue(testObj.getSubscriberList().isEmpty());

        testObj.subscribe(new SubscriberImpl("Test 1"));
        Assertions.assertEquals(1, testObj.getSubscriberList().size());
        
        testObj.subscribe(new SubscriberImpl("Test 2"));
        Assertions.assertEquals(2, testObj.getSubscriberList().size());

        testObj.subscribe(new SubscriberImpl("Test 3"));
        Assertions.assertEquals(3, testObj.getSubscriberList().size());
    } 

    @Test
    public void unSubscribeTest() {
        SubscriberImpl s1 = new SubscriberImpl("Test 1");
        SubscriberImpl s2 = new SubscriberImpl("Test 2");
        SubscriberImpl s3 = new SubscriberImpl("Test 3");
        testObj.subscribe(s1);
        testObj.subscribe(s2);
        testObj.subscribe(s3);

        Assertions.assertFalse(testObj.getSubscriberList().isEmpty());
        testObj.unSubscribe(s3);
        Assertions.assertEquals(2, testObj.getSubscriberList().size());
        testObj.unSubscribe(s2);
        Assertions.assertEquals(1, testObj.getSubscriberList().size());
        testObj.unSubscribe(s1);
        Assertions.assertEquals(0, testObj.getSubscriberList().size());
    }
}

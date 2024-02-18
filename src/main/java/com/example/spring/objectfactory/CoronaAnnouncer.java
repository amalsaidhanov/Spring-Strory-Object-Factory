package com.example.spring.objectfactory;

import lombok.ToString;

@ToString

public class CoronaAnnouncer implements Announcer {

    private  Recommendator recommendator = ObjectFactory.getInstance().createObject(Recommendator.class);

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}

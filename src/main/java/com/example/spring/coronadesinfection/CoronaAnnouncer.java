package com.example.spring.coronadesinfection;

public class CoronaAnnouncer implements Announcer {

    @Override
    public void announce(String message) {
        System.out.println(message);
    }
}

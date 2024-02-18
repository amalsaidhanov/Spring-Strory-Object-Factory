package com.example.spring.coronadesinfection;

public class Main {
    public static void main(String[] args) {
        CoronaDesinfector desin = new CoronaDesinfector();
        desin.start(new Room());
    }
}

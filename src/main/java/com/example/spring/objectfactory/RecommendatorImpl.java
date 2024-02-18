package com.example.spring.objectfactory;

public class RecommendatorImpl implements Recommendator {
    @InjectProperty()
    private String alhocol;

    @Override
    public void recommend() {
        System.out.println("RECOMMEND TO : Drink the " + alhocol + " anyway!");
    }
}

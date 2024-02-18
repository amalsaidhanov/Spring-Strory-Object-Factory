package com.example.spring.objectfactory;

import lombok.ToString;

@ToString
public class PoliceImpl implements Policeman {
    @Override
    public void makePeoLeaveRoom() {
        System.out.println("NORMAL : PIFPIFPAFPAF");
    }
}

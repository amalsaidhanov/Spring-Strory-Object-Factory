package com.example.spring.objectfactory;

import lombok.ToString;

@ToString
public class CoronaDesinfector {

    private final Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private final Policeman policeman = ObjectFactory.getInstance().createObject(PoliceImpl.class);

    public void start(Room room) {
        //annonce to exit room
        announcer.announce("INIT : CHISTKA NACHINAEM!");
        //start
        policeman.makePeoLeaveRoom();
        desinfect(room);
        //annoce to back room
        announcer.announce(" PREPARE : VHODITE");

    }

    void desinfect(Room room) {
        System.out.println("START : CHISTKA ! AAA SU KA AA!");
    }
}

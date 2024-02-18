package com.example.spring.coronadesinfection;

import lombok.ToString;

@ToString
public class CoronaDesinfector {

    private final Announcer announcer = new CoronaAnnouncer();
    private final Policeman policeman = new PoliceImpl();

    public void start(Room room) {
        //annonce to exit room
        announcer.announce("NACHINAEM! IDITE NAHUY");
        //start
        policeman.makePeoLeaveRoom();

        desinfect(room);
        //annoce to back room
        announcer.announce("VIYDITE POJALUYSTA");

    }

    void desinfect(Room room) {
        System.out.println("CHISTKA : SHALAVA KORONA IDI NAHUY!");
    }
}

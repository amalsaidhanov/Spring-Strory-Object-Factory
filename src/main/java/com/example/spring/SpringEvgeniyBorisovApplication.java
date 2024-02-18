package com.example.spring;

import com.example.spring.coronadesinfection.CoronaDesinfector;
import com.example.spring.coronadesinfection.Room;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEvgeniyBorisovApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEvgeniyBorisovApplication.class, args);
        CoronaDesinfector desin = new CoronaDesinfector();
        desin.start(new Room());
    }

}

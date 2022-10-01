package com.extra.zadanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Elephant bambo = new Elephant("Bambo");
        Tiger diego = new Tiger("Diego");

        bambo.feed();
        bambo.feed();
        bambo.addFood();
        bambo.feed();
        bambo.addFood();
        bambo.feed();
        bambo.feed();
        bambo.addFood();

        diego.feed();
        diego.feed();
        diego.addFood();
        diego.feed();
        diego.feed();
        diego.feed();
        diego.addFood();
        diego.feed();
    }

}

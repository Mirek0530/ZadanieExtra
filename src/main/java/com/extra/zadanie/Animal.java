package com.extra.zadanie;

public class Animal {
    protected int food;
    protected int water;
    private String name;

    public Animal(String name) {
        this.food = 1000;
        this.water = 1000;
        this.name = name;
    }

    public void feed() {
        this.food -= 200;
        this.water -= 100;
        System.out.println("Nakarmiono zwierzę. Jedzenie: 200, woda: 100.");
        System.out.println(toString());
    }

    public void addFood() {
        this.food += 500;
        this.water += 500;
        System.out.println("Dodałem jedzenie: +500 oraz wodę +500.");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\"" + this.name + "\", jedzenie: " + this.food + ", woda: " + this.water;
    }
}

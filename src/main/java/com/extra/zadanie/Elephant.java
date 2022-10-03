package com.extra.zadanie;

public class Elephant extends Animal {
    private int consumedFood;
    private int consumedWater;

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void feed() {
        this.food -= 400;
        consumedFood += 400;
        this.water -= 300;
        consumedWater += 300;
        System.out.println("Nakarmiono słonia. Jedzenie: 400, woda: 300.");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ". Zużyto jedzenia: " + consumedFood + ", zużyto wody: " + consumedWater;
    }
}

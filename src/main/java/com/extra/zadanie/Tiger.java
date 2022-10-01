package com.extra.zadanie;

public class Tiger extends Animal{
    private int consumedFood;
    private int consumedWater;

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed() {
        this.food -= 200;
        consumedFood += 200;
        this.water -= 80;
        consumedWater += 80;
        System.out.println("Nakarmiono tygrysa. Jedzenie: 200, woda: 80.");
        System.out.println(toString());
    }

    public String toString() {
        return super.toString() + ". Zużyto jedzenia: " + consumedFood + ", Zużyto wody: " + consumedWater;
    }
}

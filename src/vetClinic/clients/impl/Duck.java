package vetClinic.clients.impl;

import vetClinic.clients.*;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimmable, Runable {

    protected float wingLength; // длина крыла

    public Duck(String name, float weight, LocalDate age, Owner owner, String color, float wingLength) {
        super(name, weight, age, owner, color);
        this.wingLength = wingLength;
    }

    public Duck() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Duck is pecking the grain");
    }

    @Override
    public void toFly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void toSwim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Duck is running");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Wing Length : %s",
                name, weight, age, owner, color, wingLength);
    }


}

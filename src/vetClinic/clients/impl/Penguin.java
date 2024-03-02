package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Owner;
import vetClinic.clients.Runable;
import vetClinic.clients.Swimmable;

import java.time.LocalDate;

public class Penguin extends Animal implements Swimmable, Runable {

    protected float wingLength; // длина крыла

    public Penguin(String name, float weight, LocalDate age, Owner owner, String color, float wingLength) {
        super(name, weight, age, owner, color);
        this.wingLength = wingLength;
    }

    public Penguin() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Penguin is eating the fish");
    }

    @Override
    public void toSwim() {
        System.out.println("Penguin can swim");
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Penguin is running");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Wing Length : %s",
                name, weight, age, owner, color, wingLength);
    }


}

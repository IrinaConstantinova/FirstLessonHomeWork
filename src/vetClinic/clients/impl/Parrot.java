package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Flyable;
import vetClinic.clients.Owner;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable {

    public Parrot(String name, float weight, LocalDate age, Owner owner, String color) {
        super(name, weight, age, owner, color);
    }

    public Parrot() {
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Parrot is pecking the grain");
    }

    @Override
    public void toFly() {
        System.out.println("Parrot can fly");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s",
                name, weight, age, owner, color);
    }
}

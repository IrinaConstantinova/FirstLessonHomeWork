package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Owner;
import vetClinic.clients.Runable;

import java.time.LocalDate;

public class Rabbit extends Animal implements Runable {

    protected float earLength; // длина ушей

    public Rabbit(String name, float weight, LocalDate age, Owner owner, String color, float earLength) {
        super(name, weight, age, owner, color);
        this.earLength = earLength;
    }

    public Rabbit() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Rabbit is eating grass");
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Rabbit is running");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Earl Length : %s",
                name, weight, age, owner, color, earLength);
    }


}

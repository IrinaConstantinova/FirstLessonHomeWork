package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Owner;
import vetClinic.clients.Runable;
import vetClinic.clients.Swimmable;

import java.time.LocalDate;

public class Crocodile extends Animal implements Swimmable, Runable {

    protected float tailLength; // длина хвоста

    public Crocodile(String name, float weight, LocalDate age, Owner owner, String color, float tailLength) {
        super(name, weight, age, owner, color);
        this.tailLength = tailLength;
    }

    public Crocodile() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Crocodile is eating meat");
    }

    @Override
    public void toSwim() {
        System.out.println("Crocodile can swim");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Tail Length : %s",
                name, weight, age, owner, color, tailLength);
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Crocodile is running");
    }
}

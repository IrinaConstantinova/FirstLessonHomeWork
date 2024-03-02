package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Owner;
import vetClinic.clients.Runable;

import java.time.LocalDate;

public class Lion extends Animal implements Runable {

    protected boolean mane; // грива
    protected float tailLength; // длина хвоста

    public Lion(String name, float weight, LocalDate age, Owner owner, String color, boolean mane, float tailLength) {
        super(name, weight, age, owner, color);
        this.mane = mane;
        this.tailLength = tailLength;
    }

    public Lion() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Lion is eating meat");
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Lion is running");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s\n Age : %s \n Owner : %s \n Color : %s \n Mane : %s \n Tail Length : %s",
                name, weight, age, owner, color, mane, tailLength);
    }


}

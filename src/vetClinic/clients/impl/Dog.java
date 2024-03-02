package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Owner;
import vetClinic.clients.Runable;

import java.time.LocalDate;

public class Dog extends Animal implements Runable {

    protected float tailLength; // длина хвоста

    public Dog(String name, float weight, LocalDate age, Owner owner, String color, float tailLength) {
        super(name, weight, age, owner, color);
        this.tailLength = tailLength;
    }

    public Dog() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Dog is eating dog food");
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Dog is running");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Tail Length : %s",
                name, weight, age, owner, color, tailLength);
    }


}

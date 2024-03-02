package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Runable;
import vetClinic.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Runable {

    protected float tailLength; // хвост

    public Cat(String name, float weight, LocalDate age, Owner owner, String color, float tailLength) {
        super(name, weight, age, owner, color);
        this.tailLength = tailLength;
    }

    public Cat() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Cat is eating cat food");
    }

    @Override
    public void toRun() {
        System.out.println(getType() + " : " + "Cat is running");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Tail Length : %s",
                name, weight, age, owner, color, tailLength);
    }

}

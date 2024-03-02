package vetClinic.clients.impl;

import vetClinic.clients.Animal;
import vetClinic.clients.Owner;
import vetClinic.clients.Swimmable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimmable {

    protected float finLength; // длина плавника

    public Fish(String name, float weight, LocalDate age, Owner owner, String color, float finLength) {
        super(name, weight, age, owner, color);
        this.finLength = finLength;
    }

    public Fish() {
        super();
    }

    @Override
    public void toEat() {
        System.out.println(getType() + " : " + "Fish is eating...");
    }

    @Override
    public void toSwim() {
        System.out.println("Fish can swim");
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + "\n" + " Name : %s \n Weight : %s \n Age : %s \n Owner : %s \n Color : %s \n Fin Length : %s",
                name, weight, age, owner, color, finLength);
    }

}

package vetClinic.clients;

import java.time.*;

public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;
    protected String color; // окрас

    public Animal(String name, float weight, LocalDate age, Owner owner, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
        this.color = color;

    }

    public Animal() {
        this.name = "Some animal";
        this.weight = 100;
        this.age = LocalDate.now();
        this.owner = new Owner("Name");
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public abstract void toEat();

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s", name, weight, age, owner, color);
    }
}

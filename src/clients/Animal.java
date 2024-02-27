package clients;

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
    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public Animal() {
        this.name = "Some animal";
        this.weight = 100;
        this.age = LocalDate.now();
        this.owner = new Owner("Name");
    }


    private void sleep() {
        System.out.println(getType() + " Sleep");
    }

    private void wakeUp() {
        System.out.println(getType() + " Wake up");
    }
    private void wakeUp(int time) {
        System.out.println(getType() + " Wake up in " + time);
    }

    private void eat() {
        System.out.println(getType() + " Eat");
    }

    private void play() {
        System.out.println(getType() + " Play");
    }

    public void liveCircle(){
        wakeUp(20);
        eat();
        play();
        sleep();
    }
    public void toGo(){
        System.out.println(getType() + " : " + " I am going");
    }
    public void toSwim(){
        System.out.println(getType() + " : " + " I am swimming");
    }
    public void toFly(){
        System.out.println(getType() + " : " + " I am flying");
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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


    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s", name, weight, age, owner, color);
    }
}

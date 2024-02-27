package clients;

import java.time.LocalDate;

public class Rabbit extends Animal{

    protected float earLength; // длина ушей

    public Rabbit(String name, float weight, LocalDate age, Owner owner, String color, float earLength) {
        super(name, weight, age, owner, color);
        this.earLength = earLength;
    }

    public Rabbit(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Rabbit() {
        super();
    }

    public void toFly(){
        System.out.println(getType() + " : " + " I can't fly");
    }
    public void toSwim(){
        System.out.println(getType() + " : " + " I can't swim");
    }
    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s, earlLength = %s", name, weight, age, owner, color, earLength);
    }
}

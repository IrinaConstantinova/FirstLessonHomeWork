package clients;

import java.time.LocalDate;

public class Cat extends Animal{

    protected float tailLength; // хвост

    public Cat(String name, float weight, LocalDate age, Owner owner, String color, float tailLength) {
        super(name, weight, age, owner, color);
        this.tailLength = tailLength;
    }

    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Cat() {
        super();
    }

    public void toFly(){
        System.out.println(getType() + " : " + " I can't fly");
    }
    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s, tailLength = %s", name, weight, age, owner, color, tailLength);
    }
}

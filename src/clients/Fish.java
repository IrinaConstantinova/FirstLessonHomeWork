package clients;

import java.time.LocalDate;

public class Fish extends Animal{

    protected float finLength; // длина плавника

    public Fish(String name, float weight, LocalDate age, Owner owner, String color, float finLength) {
        super(name, weight, age, owner, color);
        this.finLength = finLength;
    }

    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Fish() {
        super();
    }

    public void toFly(){
        System.out.println(getType() + " : " + " I can't fly");
    }
    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s, finLength = %s", name, weight, age, owner, color, finLength);
    }
}

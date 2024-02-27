package clients;

import java.time.LocalDate;

public class Penguin extends Animal{

    protected float wingLength; // длина крыла

    public Penguin(String name, float weight, LocalDate age, Owner owner, String color, float wingLength) {
        super(name, weight, age, owner, color);
        this.wingLength = wingLength;
    }

    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Penguin() {
        super();
    }

    public void toFly(){
        System.out.println(getType() + " : " + " I can't fly");
    }
    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s, wingLength = %s", name, weight, age, owner, color, wingLength);
    }
}

package clients;

import java.time.LocalDate;

public class Dog extends Animal{

    protected float tailLength; // длина хвоста

    public Dog(String name, float weight, LocalDate age, Owner owner, String color, float tailLength) {
        super(name, weight, age, owner, color);
        this.tailLength = tailLength;
    }

    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Dog() {
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

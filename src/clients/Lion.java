package clients;

import java.time.LocalDate;

public class Lion extends Animal{

    protected boolean mane; // грива
    protected float tailLength; // длина хвоста

    public Lion(String name, float weight, LocalDate age, Owner owner, String color, boolean mane, float tailLength) {
        super(name, weight, age, owner, color);
        this.mane = mane;
        this.tailLength = tailLength;
    }

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }

    public void toFly(){
        System.out.println(getType() + " : " + " I can't fly");
    }
    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s, color = %s, mane = %s, tailLength = %s", name, weight, age, owner, color, mane, tailLength);
    }
}

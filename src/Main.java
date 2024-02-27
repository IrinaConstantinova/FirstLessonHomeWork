import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal leva = new Lion("Leva", 200, LocalDate.now(), new Owner("Mike"), "yellow", true, 0.95f );
        Animal kuzea = new Lion("Kuzea", 250, LocalDate.now(), new Owner("Nick"), "white", false, 0.71f);
        Animal laika = new Dog("Laika", 13, LocalDate.now(), new Owner("Alex"), "black", 0.33f);
        Animal frank = new Crocodile("Frank", 150, LocalDate.now(), new Owner("Lisa"), "green", 1.64f );
        Animal goldy = new Fish("Goldy", 0.5f, LocalDate.now(), new Owner("Bob"), "gold", 0.15f);
        Animal george = new Penguin("George", 5, LocalDate.now(), new Owner("Anna"), "black",0.51f);
        Animal funny = new Duck("Funny", 1.5f, LocalDate.now(), new Owner("Elza"),"white", 0.36f);
        Animal puffy = new Rabbit("Puffy", 2, LocalDate.now(), new Owner("Oleg"),"brown", 0.23f);
        Animal kitty = new Cat("Kitty", 4, LocalDate.now(), new Owner("Elena"), "gray", 0.32f);

        List<Animal> animals = new ArrayList<>();
        animals.add(leva);
        animals.add(kuzea);
        animals.add(laika);
        animals.add(frank);
        animals.add(goldy);
        animals.add(george);
        animals.add(funny);
        animals.add(puffy);
        animals.add(kitty);
        System.out.println(animals);

//        System.out.println(leva);
//        System.out.println(kuzea);
//        System.out.println(laika);
//        System.out.println(frank);
//        System.out.println(goldy);
//        System.out.println(george);
//        System.out.println(funny);
//        System.out.println(puffy);
//        System.out.println(kitty);
        System.out.println("---------------");
        Animal testLion = new Lion();
        Animal testDog = new Dog();
        System.out.println(testLion);
        System.out.println(testDog);
        System.out.println("---------------");
        System.out.println(kitty);
        kitty.liveCircle();
        System.out.println("---------------");
        kitty.toGo();
        kitty.toFly();
        kitty.toSwim();



    }
}
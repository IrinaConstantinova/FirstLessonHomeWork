package vetClinic.veterinaryClinic;

import vetClinic.clients.*;
import vetClinic.clients.impl.Cat;
import vetClinic.personal.Personal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {

    private List<Personal> personals;
    private List<Animal> animals ;

    public VeterinaryClinic() {
        this.personals = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public List<Personal> getPersonals() {
        return personals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addPersonal(Personal employee){
        personals.add(employee);
    }

    public void removePersonal(Personal employee){
        personals.remove(employee);
    }

    public void addAnimalToClinic(Animal animal){
        animals.add(animal);
    }

    public void dischargeFromClinic(Animal animal){
        animals.remove(animal);
    }

    public List<Animal> getSwimmable(){
        List<Animal> swimmableList = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof Swimmable){
                swimmableList.add(animal);
            }
        }
        return swimmableList;
    }
    public List<Animal> getRunable(){
        List<Animal> runableList = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof Runable){
                runableList.add(animal);
            }
        }
        return runableList;
    }
    public List<Animal> getFlyable(){
        List<Animal> flyableList = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof Flyable){
                flyableList.add(animal);
            }
        }
        return flyableList;
    }
}

import vetClinic.clients.*;
import vetClinic.clients.impl.*;
import vetClinic.personal.Healable;
import vetClinic.personal.impl.Doctor;
import vetClinic.personal.impl.Nurse;
import vetClinic.personal.Personal;
import vetClinic.pharmacy.MedComponent;
import vetClinic.pharmacy.Medicine;
import vetClinic.pharmacy.Medicine2;
import vetClinic.pharmacy.impl.*;
import vetClinic.veterinaryClinic.VeterinaryClinic;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Animal leva = new Lion("Leva", 200, LocalDate.now(), new Owner("Mike"), "yellow", true, 0.95f );
//        Animal kuzea = new Lion("Kuzea", 250, LocalDate.now(), new Owner("Nick"), "white", false, 0.71f);
//        Animal laika = new Dog("Laika", 13, LocalDate.now(), new Owner("Alex"), "black", 0.33f);
//        Animal frank = new Crocodile("Frank", 150, LocalDate.now(), new Owner("Lisa"), "green", 1.64f );
//        Animal goldy = new Fish("Goldy", 0.5f, LocalDate.now(), new Owner("Bob"), "gold", 0.15f);
//        Animal george = new Penguin("George", 5, LocalDate.now(), new Owner("Anna"), "black",0.51f);
//        Animal funny = new Duck("Funny", 1.5f, LocalDate.now(), new Owner("Elza"),"white", 0.36f);
//        Animal puffy = new Rabbit("Puffy", 2, LocalDate.now(), new Owner("Oleg"),"brown", 0.23f);
//        Animal kitty = new Cat("Kitty", 4, LocalDate.now(), new Owner("Elena"), "gray", 0.32f);
//        Animal sam = new Parrot("Sam", 0.50f, LocalDate.now(), new Owner("Lana"), "blue");

//        Personal fiona = new Nurse("Fiona", 1, "Chief nurse");
//        Personal anna = new Nurse("Anna", 3, "Assistant surgeon");
//        Personal alan = new Doctor("Alan", 2, "Chief doctor");
//        Personal dana = new Doctor("Dana", 4, "Doctor");
//        Doctor alf = new Doctor("Bil", 6, "Doctor");
//        Nurse nora= new Nurse("Nora", 8, "Junior nurse");
//
//        VeterinaryClinic clinic = new VeterinaryClinic();
//
//        clinic.addPersonal(alf);
//        clinic.addPersonal(nora);
//        clinic.addPersonal(fiona);
//        clinic.addPersonal(anna);
//        clinic.addPersonal(alan);
//        clinic.addPersonal(dana);
//
//        System.out.println(clinic.getPersonals());
//        System.out.println("---------------------");
//        System.out.println("\n" + "All veterinary clinic doctors: " );
//        System.out.println(clinic.getDoctors());
//        System.out.println("\n" + "All veterinary clinic nurses: " );
//        System.out.println(clinic.getNurses());


//        clinic.removePersonal(fiona);
//        System.out.println(clinic.getPersonals());
//        System.out.println("--------------------");
//
//        clinic.addAnimalToClinic(sam);
//        clinic.addAnimalToClinic(kitty);
//        clinic.addAnimalToClinic(puffy);
//        clinic.addAnimalToClinic(funny);
//        clinic.addAnimalToClinic(george);
//        clinic.addAnimalToClinic(goldy);
//        clinic.addAnimalToClinic(frank);
//        clinic.addAnimalToClinic(laika);
//        clinic.addAnimalToClinic(kuzea);
//        clinic.addAnimalToClinic(leva);
//        System.out.println(clinic.getAnimals());
//        System.out.println("--------------------");

//        clinic.dischargeFromClinic(leva);
//        System.out.println(clinic.getAnimals());

//        System.out.println("--------------------");
//        System.out.println(kitty);
//        alf.heal(kitty);
//        alf.prescribeDiagnose(kitty);
//        nora.vaccinate(kitty);

//        System.out.println("\n" + "Animals that can fly: " );
//        System.out.println(clinic.getFlyable());
//        System.out.println("\n" + "Animals that can run: ");
//        System.out.println(clinic.getRunable());
//        System.out.println("\n" + "Animals that can swim: ");
//        System.out.println(clinic.getSwimmable());


        MedComponent asitromin = new Asitromin("Asitromin", 30, 10);
        MedComponent eritromicin = new Eritromicin("Eritromicin", 10, 100);
        MedComponent penicilin = new Penicilin("Penicilin", 60, 20);
        MedComponent tetraciclin = new Tetraciclin("Tetraciclin", 45, 50);
        MedComponent hentamicin = new Hentamicin("Hentamicin", 80, 40);
        MedComponent doxiciclin = new Doxiciclin("Doxiciclin", 70, 150);

        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        Medicine medicine3 = new Medicine();
        Medicine medicine4 = new Medicine();

        medicine1.addComponent(asitromin).addComponent(doxiciclin).addComponent(eritromicin);
        medicine2.addComponent(hentamicin).addComponent(penicilin).addComponent(tetraciclin).addComponent(eritromicin);
        medicine3.addComponent(penicilin).addComponent(doxiciclin);
        medicine4.addComponent(tetraciclin).addComponent(doxiciclin).addComponent(asitromin);

        System.out.println("medicine1 (лекарство1):");
        for (MedComponent component : medicine1){
            System.out.println(component);
        }
        System.out.println("----------------");
        System.out.println("Список лекарств, состоящий из списков мед компонентов:");
        List<Medicine> medicineList = new ArrayList<>();
        medicineList.add(medicine1);
        medicineList.add(medicine2);
        medicineList.add(medicine4);
        medicineList.add(medicine3);
        System.out.println(medicineList);

        System.out.println("----------------");
        System.out.println("Отсортированный по весу компонентов список лекарств:");
        Collections.sort(medicineList);
        System.out.println(medicineList);

//        System.out.println("----------------");
//        System.out.println("Отсортированный по силе компонентов список лекарств:");
//        Collections.sort(medicineList);
//        System.out.println(medicineList);



//        Medicine2 med1 = new Medicine2();
//        med1.addComponent(asitromin).addComponent(eritromicin).addComponent(penicilin);
////        while (med1.hasNext()){
////            System.out.println(med1.next());
////        }
//        for (MedComponent component : med1){
//            System.out.println(component);
//        }
//        List<MedComponent> medComponentList = new ArrayList<>();
//        medComponentList.add(asitromin);
//        medComponentList.add(eritromicin);
//        medComponentList.add(penicilin);
//        System.out.println(medComponentList);

//        Collections.sort(medComponentList);
//        System.out.println(medComponentList);

//        Collections.sort(medComponentList, Comparator.reverseOrder());
//        System.out.println(medComponentList);

//        Collections.sort(medComponentList, (comp1, comp2) -> (int)(comp1.getWeight() - comp2.getWeight()));
//        System.out.println(medComponentList);

    }
}
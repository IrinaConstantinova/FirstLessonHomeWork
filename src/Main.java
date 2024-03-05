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


    }
}
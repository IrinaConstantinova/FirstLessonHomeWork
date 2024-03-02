package vetClinic.personal.impl;

import vetClinic.clients.Animal;
import vetClinic.personal.Healable;
import vetClinic.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Personal implements Healable {

    public Doctor(String name, int id, String positionAtWork) {
        super(name, id, positionAtWork);
    }


    @Override
    public void heal(Animal animal){System.out.println(getType() + " - " + getName() + " : " + "I treat animal " + animal.getName());}

    @Override
    public void prescribeDiagnose(Animal animal) {
        List<String> diagnose = new ArrayList<>();
        diagnose.add("Salmonellios");
        diagnose.add("Tuberkules");
        diagnose.add("Toksoplazmos");
        diagnose.add("Micoplazmos");

        int random = (int)(Math.random() * 2);
        System.out.println("Patient: "+ animal.getName() + " Owner: "+ animal.getOwner() + " - Diagnose: " + diagnose.get(random));

    }
}

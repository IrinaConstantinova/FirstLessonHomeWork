package vetClinic.personal.impl;

import vetClinic.clients.Animal;
import vetClinic.personal.Personal;
import vetClinic.personal.Treatable;

public class Nurse extends Personal implements Treatable {

    public Nurse(String name, int id, String positionAtWork) {
        super(name, id, positionAtWork);
    }

    @Override
    public void vaccinate(Animal animal) {
            System.out.println(getType() + " - " + getName() + " : " + "Vaccinated patient: " + animal.getName());
    }
}

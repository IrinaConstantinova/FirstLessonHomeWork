package vetClinic.personal.impl;

import vetClinic.personal.Adminable;
import vetClinic.personal.Personal;

public class Administrator extends Personal implements Adminable {

    public Administrator(String name, int id, String positionAtWork) {
        super(name, id, positionAtWork);
    }

    @Override
    public void receiveCalls() {System.out.println(getType() + " : " + "I take calls");}
}

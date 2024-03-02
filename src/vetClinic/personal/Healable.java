package vetClinic.personal;

import vetClinic.clients.Animal;

public interface Healable {

    public void heal(Animal animal);
    public void prescribeDiagnose(Animal animal);
}

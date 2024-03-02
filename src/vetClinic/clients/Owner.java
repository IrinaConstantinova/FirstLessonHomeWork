package vetClinic.clients;

public class Owner {

    protected String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

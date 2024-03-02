package vetClinic.personal;

public abstract class Personal {
    protected String name;
    protected int id;
    protected String positionAtWork;

    public Personal(String name, int id, String positionAtWork) {
        this.name = name;
        this.id = id;
        this.positionAtWork = positionAtWork;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("\n" + getType() + " \n " + "Name : %s \n Id : %s \n Position at work : %s", name, id, positionAtWork );
    }
}

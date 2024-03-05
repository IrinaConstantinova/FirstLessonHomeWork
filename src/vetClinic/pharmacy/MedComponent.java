package vetClinic.pharmacy;

public abstract class MedComponent implements Comparable<MedComponent>{
    private String name;
    private float weight;
    private int power;

    public MedComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public int compareTo(MedComponent o) {
//        return power - o.power;
        return Integer.compare(this.power, o.power);
//        if (this.power < o.power){
//            return -1;
//        } else if (this.power > o.power) {
//            return 1;
//        }else return 0;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "MedComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}

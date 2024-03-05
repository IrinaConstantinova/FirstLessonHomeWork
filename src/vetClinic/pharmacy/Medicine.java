package vetClinic.pharmacy;

import java.util.*;

public class Medicine implements Iterable<MedComponent>, Comparable<Medicine>{

    private List<MedComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedComponent component){
        components.add(component);
        return this;
    }

    @Override
    public String toString() {
        return "\n" + "Лекарство: " + components.toString() ;
    }

    private int getTotalPower(){
        int totalPower = 0;
        for (MedComponent component : components){
            totalPower += component.getPower();
        }
        return totalPower;
    }
    private float getTotalWeight(){
        float totalWeight = 0;
        for (MedComponent component : components){
            totalWeight += component.getWeight();
        }
        return totalWeight;
    }

    @Override
    public int compareTo(Medicine o) {
        return Integer.compare((int)this.getTotalWeight(), (int)o.getTotalWeight());
//        return Integer.compare(this.getTotalPower(), o.getTotalPower());
    }

    @Override
    public Iterator<MedComponent> iterator() {
        return new Iterator<MedComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedComponent next() {
                return components.get(index++);
            }
        };
    }


}


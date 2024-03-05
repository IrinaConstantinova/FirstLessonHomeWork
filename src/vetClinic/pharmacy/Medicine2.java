package vetClinic.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedComponent> {

    private List<MedComponent> components;
    private int index;

    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedComponent component){
        components.add(component);
        return this;
    }

//    @Override
//    public boolean hasNext() {
////        return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedComponent next() {
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
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


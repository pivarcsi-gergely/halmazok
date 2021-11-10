package hu.petrik.Set;

import java.util.ArrayList;
import java.util.List;

public class Set<T> { // T típusu elemek fogadására lesz alkalmas

    private List<T> elements;

    public Set() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        if (!this.elements.contains(element)){
            this.elements.add(element);
        }

    }

    public boolean remove(T element) {
        boolean isRemoved = false;

        if (this.elements.contains(element)) {
            this.elements.remove(element);
            isRemoved = true;
        }

        return isRemoved;
    }
}

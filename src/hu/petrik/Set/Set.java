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
        //return this.elements.remove(element); -> ugyanazt csinálja, mint a lenti sorok

        boolean isRemoved = false;

        if (this.elements.contains(element)) {
            this.elements.remove(element);
            isRemoved = true;
        }

        return isRemoved;
    }

    public int getSize() {
        return this.elements.size();
    }

    public void clear() {
        this.elements.clear();
    }

    public boolean isElement(T element) {
        int i = 0;
        //boolean isElement = false;

        while (i < this.elements.size() && this.elements.get(i) != element) {
            i++;

        }

        return i<this.elements.size();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty(); //this.elements.getSize() == 0;
    }

    public boolean isPartOf(Set<T> otherSet) {
        boolean isBigger = this.getSize() <= otherSet.getSize();
        boolean isPartOf = false;
        int i = 0;

        if (!isBigger) {
            while (i < this.getSize() && otherSet.isElement(this.elements.get(i))) {
                i++;
            }
            isPartOf = i == this.getSize();
        }
        return isPartOf;
    }

    public boolean isEquals (Set<T> otherSet) {
        return this.getSize() == otherSet.getSize() && this.isPartOf(otherSet);
    }
}

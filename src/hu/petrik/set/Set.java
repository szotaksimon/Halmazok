package hu.petrik.set;

import java.util.ArrayList;
import java.util.List;

public class Set<T> { //T típusú elemek fogadására alkalmas

    private List<T> elements;

    public Set(){
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        if(!this.elements.contains(element)){
            this.elements.add(element);
        }
    }

    public boolean remove(T element){
        //return this.elements.remove(element);
        boolean isRemoved = false;

        if(this.elements.contains(element)){
            this.elements.remove(element);
            isRemoved = true;
        }

        return isRemoved;
    }

    public int getSize(){
        return this.elements.size();
    }

    public void clear(){
        this.elements.clear();
    }

    public boolean isElement(T element){
        int i = 0;
        while (i < this.elements.size() && this.elements.get(i) != element){
            i++;
        }

        return  i<this.elements.size();
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public boolean isEqual(Set<T> otherSet){
        return this.getSize() == otherSet.getSize() && this.isPartOf(otherSet);
    }

    public boolean isPartOf(Set<T> otherSet){
        boolean isBogger = this.getSize() > otherSet.getSize();
        boolean isPartOf = false;

        if (!isBogger){
            int i = 0;
            while (i < this.getSize() && otherSet.isElement(this.elements.get(i))){
                i++;
            }

            isPartOf = i == this.getSize();
        }

        return isPartOf;

    }

    public Set<T> unio(Set<T> otherSet){
        Set<T> unioSet = this;
        for (T elemeent: this.elements){
            unioSet.add(elemeent);
        }
        for (T elemeent: otherSet.elements){
            unioSet.add(elemeent);
        }
        return unioSet;
    }

    public Set<T> intersect(Set<T> otherSet){
        Set<T> intersectSet = new Set<T>();
        for (T element: this.elements) {
            for (T otherElement: otherSet.elements){
                if(element == otherElement){
                    intersectSet.add(element);
                }
            }

        }
        return intersectSet;
    }

    @Override
    public String toString(){
        String s = "";
        for (T element: this.elements){
            s += elements + "\n";
        }
        return s;
    }




}
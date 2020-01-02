package com.brigdelabz;

public class MaximumVariable <E extends Comparable> {

    E x,y,z;
    public MaximumVariable(E x,E y,E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MaximumVariable() {

    }

    public E testMaximum() {
        E maximumVar = maximumVariable(x,y,z);
        return maximumVar;
    }

    public static <E extends Comparable> E maximumVariable(E x, E y, E z){
        E maxValue;
        if (x.compareTo(y)>0){
            maxValue=x;
        }
        else {
            maxValue=y;
        }
        if (maxValue.compareTo(z)<0)
        {
            maxValue=z;
        }

        return maxValue;
    }

}

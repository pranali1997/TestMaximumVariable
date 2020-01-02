package com.brigdelabz;

import java.util.Arrays;

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
        printMax((Integer) maximumVar);
        return maximumVar;
    }

    public void printMax(Integer maximumVar)
    {
        System.out.println("Value of  "+maximumVar);
    }
    public static <E extends Comparable> E maximumVariable(E... val){
        E[] values =val;
        int length=values.length;
        Arrays.sort(values);

        return values[length-1];
    }

}

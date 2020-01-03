package com.brigdelabz;

import java.util.Arrays;

public class MaximumVariable <E extends Comparable> {

    E[] array;
    public MaximumVariable(E... array) {
        this.array = array;
    }
    public MaximumVariable() {

    }

    public E testMaximum() {
        E maximumVar = testMaximum(array);
        return maximumVar;
    }

    public static <E extends Comparable> void printMax(E maximumVar) {

        System.out.println("Value of  "+maximumVar);
    }


    public static <E extends Comparable> E testMaximum(E... val){
        E[] values =val;
        int length=values.length;
        Arrays.sort(values);
        printMax(values[length-1]);
        return values[length-1];
    }

}

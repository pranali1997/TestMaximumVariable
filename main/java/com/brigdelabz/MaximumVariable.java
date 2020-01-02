package com.brigdelabz;

public class MaximumVariable {

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

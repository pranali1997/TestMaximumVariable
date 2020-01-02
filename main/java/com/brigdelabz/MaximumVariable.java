package com.brigdelabz;

public class MaximumVariable {
    public Integer maximumInteger(Integer x,Integer y, Integer z) {
        Integer maxValue;
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

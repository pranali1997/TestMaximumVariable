package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumVariableTest {
    @Test
    public void whenGivenThreeIntegers_shouldReturnFirstVariableMaximum(){
        MaximumVariable maximumVariable = new MaximumVariable();
        int firstNumber=maximumVariable.maximumInteger(23,12,21);
        Assert.assertEquals(23,firstNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnSecondVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int secondNumber=maximumVariable.maximumInteger(21,23,21);
        Assert.assertEquals(23,secondNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int thirdNumber=maximumVariable.maximumInteger(2,12,21);
        Assert.assertEquals(21,thirdNumber);
    }
}

package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumVariableTest {
    @Test
    public void whenGivenThreeIntegers_shouldReturnFirstVariableMaximum(){
        MaximumVariable maximumVariable = new MaximumVariable();
        int firstNumber=maximumVariable.maximumVariable(23,12,21);
        Assert.assertEquals(23,firstNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnSecondVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int secondNumber=maximumVariable.maximumVariable(21,23,21);
        Assert.assertEquals(23,secondNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int thirdNumber=maximumVariable.maximumVariable(2,12,21);
        Assert.assertEquals(21,thirdNumber);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnFirstValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.maximumVariable(27.1f,12.4f,21.5f);
        Assert.assertEquals(27.1f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnSecondValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.maximumVariable(2.1f,29.4f,21.5f);
        Assert.assertEquals(29.4f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.maximumVariable(2.1f,12.4f,21.5f);
        Assert.assertEquals(21.5f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeString_shouldReturnFirstStringMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String firstString=maximumVariable.maximumVariable("Peach","Apple","Banana");
        Assert.assertEquals("Peach",firstString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnSecondStringMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String secondString=maximumVariable.maximumVariable("Apple","Peach","Banana");
        Assert.assertEquals("Peach",secondString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnThirdStringMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String thirdString=maximumVariable.maximumVariable("Apple","Banana","Peach");
        Assert.assertEquals("Peach",thirdString);
    }
}

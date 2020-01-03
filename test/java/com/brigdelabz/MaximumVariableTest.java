package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumVariableTest {
    @Test
    public void whenGivenThreeIntegers_shouldReturnFirstVariableMaximum(){
        MaximumVariable maximumVariable = new MaximumVariable();
        int firstNumber=maximumVariable.testMaximum(23,12,21);
        Assert.assertEquals(23,firstNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnSecondVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int secondNumber=maximumVariable.testMaximum(21,23,21);
        Assert.assertEquals(23,secondNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        int thirdNumber=maximumVariable.testMaximum(2,12,21);
        Assert.assertEquals(21,thirdNumber);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnFirstValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.testMaximum(27.1f,12.4f,21.5f);
        Assert.assertEquals(27.1f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnSecondValueMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.testMaximum(2.1f,29.4f,21.5f);
        Assert.assertEquals(29.4f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnThirdVariableMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.testMaximum(2.1f,12.4f,21.5f);
        Assert.assertEquals(21.5f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeString_shouldReturnFirstStringMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String firstString=maximumVariable.testMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",firstString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnSecondStringMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String secondString=maximumVariable.testMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",secondString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnThirdStringMaximum() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String thirdString=maximumVariable.testMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",thirdString);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnFirstVariableMaximum_forMoreThanThreeVariables(){
        MaximumVariable maximumVariable = new MaximumVariable();
        int firstNumber=maximumVariable.testMaximum(23,12,21,2);
        Assert.assertEquals(23,firstNumber);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnSecondValueMaximum_forMoreThanThreeVariables() {
        MaximumVariable maximumVariable = new MaximumVariable();
        float firstNumber=maximumVariable.testMaximum(2.1f,29.4f,21.5f,1.1f,3.1f,4.1f);
        Assert.assertEquals(29.4f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeString_shouldReturnThirdStringMaximum_forMoreThanThreeVariables() {
        MaximumVariable maximumVariable = new MaximumVariable();
        String thirdString=maximumVariable.testMaximum("Apple","Banana","Peach","Mango","Strawberry");
        Assert.assertEquals("Strawberry",thirdString);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnFirstVariableMaximum_usingCLassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable(23,21,20);
        int firstInteger= (int) maximumVariable.testMaximum();
        Assert.assertEquals(23,firstInteger);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnSecondVariableMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable(21,23,21);
        int secondNumber= (int) maximumVariable.testMaximum();
        Assert.assertEquals(23,secondNumber);
    }

    @Test
    public void whenGivenThreeIntegers_shouldReturnThirdVariableMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable(2,12,21);
        int thirdNumber= (int) maximumVariable.testMaximum();
        Assert.assertEquals(21,thirdNumber);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnFirstValueMaximum_usingClassGenric() {
        MaximumVariable maximumVariable = new MaximumVariable(27.1f,12.4f,21.5f);
        float firstNumber= (float) maximumVariable.testMaximum();
        Assert.assertEquals(27.1f,firstNumber,0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnSecondValueMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable(2.1f,29.4f,21.5f);
        float secondNumber= (float) maximumVariable.testMaximum();
        Assert.assertEquals(29.4f,secondNumber,0.0);
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnThirdVariableMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable(2.1f,12.4f,21.5f);
        float thirdNumber= (float) maximumVariable.testMaximum();
        Assert.assertEquals(21.5f,thirdNumber,0.0);
    }

    @Test
    public void whenGivenThreeString_shouldReturnFirstStringMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable("Peach","Apple","Banana");
        String firstString= (String) maximumVariable.testMaximum();
        Assert.assertEquals("Peach",firstString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnSecondStringMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable("Apple","Peach","Banana");
        String secondString= (String) maximumVariable.testMaximum();
        Assert.assertEquals("Peach",secondString);
    }

    @Test
    public void whenGivenThreeString_shouldReturnThirdStringMaximum_usingClassGeneric() {
        MaximumVariable maximumVariable = new MaximumVariable("Apple","Banana","Peach");
        String thirdString= (String) maximumVariable.testMaximum();
        Assert.assertEquals("Peach",thirdString);
    }

}

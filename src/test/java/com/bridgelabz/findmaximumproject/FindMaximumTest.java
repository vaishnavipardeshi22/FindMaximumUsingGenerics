package com.bridgelabz.findmaximumproject;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenThreeIntegers_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = findMaximum.getMaximumInteget(10, 9, 8);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = findMaximum.getMaximumInteget(8, 10, 9);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = findMaximum.getMaximumInteget(8, 9, 10);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximumValue = findMaximum.getMaximumFloat(10.2f, 9.2f, 8.2f);
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximumValue = findMaximum.getMaximumFloat(8.2f, 10.2f, 9.2f);
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximumValue = findMaximum.getMaximumFloat(8.2f, 9.2f, 10.2f);
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = findMaximum.getMaximumString("orange", "apple", "banana");
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = findMaximum.getMaximumString("apple", "orange", "banana");
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = findMaximum.getMaximumString("apple", "banana", "orange");
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = findMaximum.getMaximumString("ORANGE", "APPLE", "BANANA");
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = findMaximum.getMaximumString("APPLE", "ORANGE", "BANANA");
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = findMaximum.getMaximumString("APPLE", "BANANA", "ORANGE");
        Assert.assertEquals("ORANGE", maximumValue);
    }
}

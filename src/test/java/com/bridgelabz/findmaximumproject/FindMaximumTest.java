package com.bridgelabz.findmaximumproject;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenThreeIntegers_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = (Integer) findMaximum.getMaximumValue(10, 9, 8);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = (Integer) findMaximum.getMaximumValue(8, 10, 9);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = (Integer) findMaximum.getMaximumValue(8, 9, 10);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximumValue = (Float) findMaximum.getMaximumValue(10.2f, 9.2f, 8.2f);
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximumValue = (Float) findMaximum.getMaximumValue(8.2f, 10.2f, 9.2f);
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximumValue = (Float) findMaximum.getMaximumValue(8.2f, 9.2f, 10.2f);
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("orange", "apple", "banana");
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("apple", "orange", "banana");
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("apple", "banana", "orange");
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("ORANGE", "APPLE", "BANANA");
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("APPLE", "ORANGE", "BANANA");
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("APPLE", "BANANA", "ORANGE");
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsAsInteger_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("3", "2", "1");
        Assert.assertEquals("3", maximumValue);
    }

    @Test
    public void givenThreeStringsAsInteger_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("1", "3", "2");
        Assert.assertEquals("3", maximumValue);
    }

    @Test
    public void givenThreeStringsAsInteger_WhenMaximumAtLast_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        String maximumValue = (String) findMaximum.getMaximumValue("1", "2", "3");
        Assert.assertEquals("3", maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtStart_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum(10, 9, 8);
        Integer maximumValue = (Integer) findMaximum.getMaximumValue();
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtMiddle_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum(8, 10, 9);
        Integer maximumValue = (Integer) findMaximum.getMaximumValue();
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtLast_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum(8, 9, 10);
        Integer maximumValue = (Integer) findMaximum.getMaximumValue();
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtStart_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum(10.2f, 9.2f, 8.2f);
        Float maximumValue = (Float) findMaximum.getMaximumValue();
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtMiddle_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum(8.2f, 10.2f, 9.2f);
        Float maximumValue = (Float) findMaximum.getMaximumValue();
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeFloats_WhenMaximumAtLast_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum(8.2f, 9.2f, 10.2f);
        Float maximumValue = (Float) findMaximum.getMaximumValue();
        Assert.assertEquals((Float) 10.2f, maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtStart_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("orange", "apple", "banana");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtMiddle_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("apple", "orange", "banana");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStrings_WhenMaximumAtLast_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("apple", "banana", "orange");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("orange", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtStart_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("ORANGE", "APPLE", "BANANA");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtMiddle_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("APPLE", "ORANGE", "BANANA");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsWithUpperCase_WhenMaximumAtLast_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("APPLE", "BANANA", "ORANGE");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("ORANGE", maximumValue);
    }

    @Test
    public void givenThreeStringsAsInteger_WhenMaximumAtStart_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("3", "2", "1");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("3", maximumValue);
    }

    @Test
    public void givenThreeStringsAsInteger_WhenMaximumAtMiddle_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("1", "3", "2");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("3", maximumValue);
    }

    @Test
    public void givenThreeStringsAsInteger_WhenMaximumAtLast_ReturnMaximumValueByGenericClass() {
        FindMaximum findMaximum = new FindMaximum("1", "2", "3");
        String maximumValue = (String) findMaximum.getMaximumValue();
        Assert.assertEquals("3", maximumValue);
    }
}


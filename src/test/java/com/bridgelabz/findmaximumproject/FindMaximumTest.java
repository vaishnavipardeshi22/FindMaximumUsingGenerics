package com.bridgelabz.findmaximumproject;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenThreeIntegers_WhenMaximumAtStart_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = findMaximum.getMaximumInteget(10,9,8);
        Assert.assertEquals((Integer) 10, maximumValue);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumAtMiddle_ReturnMaximumValue() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximumValue = findMaximum.getMaximumInteget(8,10,9);
        Assert.assertEquals((Integer) 10, maximumValue);
    }
}

package com.bridgelabz.findmaximumproject;

public class FindMaximum {

    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO FIND MAXIMUM ********************");
    }

    //METHOD TO GET MAXIMUM INTEGER VALUE
    public Integer getMaximumInteget(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maximum=firstValue;
        Integer maximumInteger = thirdValue > (secondValue.compareTo(maximum) > 0 ? secondValue : firstValue) ? thirdValue :
                ((secondValue.compareTo(maximum) > 0) ? secondValue : firstValue);
        return maximumInteger;
    }

    //METHOD TO GET MAXIMUM FLOAT VALUE
    public Float getMaximumFloat(Float firstValue, Float secondValue, Float thirdValue) {
        Float maximum=firstValue;
        Float maximumFloat = thirdValue > (secondValue.compareTo(maximum) > 0 ? secondValue : firstValue) ? thirdValue :
                ((secondValue.compareTo(maximum) > 0) ? secondValue : firstValue);
        return maximumFloat;
    }

    //METHOD TO GET MAXIMUM STRING VALUE
    public String getMaximumString(String firstValue, String secondValue, String thirdValue) {
        String maximum=firstValue;
        if (secondValue.compareTo(maximum) > 0)
            maximum = secondValue;
        if (thirdValue.compareTo(maximum) > 0)
            maximum = thirdValue;
        return maximum;
    }
}

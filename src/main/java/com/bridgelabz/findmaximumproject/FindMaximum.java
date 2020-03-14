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
}

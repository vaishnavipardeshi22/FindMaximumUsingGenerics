package com.bridgelabz.findmaximumproject;

public class FindMaximum {

    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO FIND MAXIMUM ********************");
    }

    //METHOD TO GET MAXIMUM VALUE
    public <T extends Comparable<T>> T getMaximumValue(T firstValue, T secondValue, T thirdValue) {
        T maximumValue=firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }
}

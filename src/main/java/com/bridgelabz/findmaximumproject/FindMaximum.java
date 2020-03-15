package com.bridgelabz.findmaximumproject;

public class FindMaximum<T extends Comparable<T>> {

    private T firstValue;
    private T secondValue;
    private T thirdValue;

    //PARAMETERISED CONSTRUCTOR
    public FindMaximum(T firstValue, T secondValue, T thirdValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //METHOD TO CALL INTERNAL METHOD
    public T getMaximumValue(){
        return getMaximumValue(firstValue, secondValue, thirdValue);
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

    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO FIND MAXIMUM ********************");
    }
}

package org.example;

//Using a Test Driven and Object Oriented approach, create a simple String Calculator which covers the following requirements:
//        1. adds numbers present in the input, e.g "1,2" = 3
//        2. treats empty or null input as zero, e.g "" = 0, null = 0
//        3. supports different delimiters, e.g "1,2,3", "1 2 3"
//        4. does not support negative numbers
//        5. ignores numbers greater than 100
//        Java SE (any version) and JUnit (any version) are the only libraries allowed.

public class Calculator {
    //value for calculation
    private String valueForCalc;

    //result of calculation
    private int result;

    //constructor with assigning value for calculation
    public Calculator(String valueForCalc) {
        this.valueForCalc = valueForCalc;
    }

    //default constructor
    public Calculator() {
    }

    //getter of value for calculation
    public String getValueForCalc() {
        return valueForCalc;
    }

    //setter for changing value for calculation
    public void setValueForCalc(String valueForCalc) {
        this.valueForCalc = valueForCalc;
    }

    //getter for result. Calculation start here
    public int getResult() {
        handler(); //result is assign here if value for calculation is valid and return
        return result;
    }

    //method for calculation
    private int plus() {
        if (valueForCalc == null || valueForCalc.equals("")) return 0;
        String[] arrayOfNumbers = valueForCalc.split("[^-a-zA-Z\\d]");
        int sum = 0;
        for (String number : arrayOfNumbers) {
            int a = Integer.parseInt(number);
            if (a > 100) continue;
            if (a < 0) throw new IllegalArgumentException("Negative numbers don't support");
            sum += a;
        }
        return sum;
    }

    //handler of Exceptions
    private void handler() {
        try {
            result = plus();
        } catch (NumberFormatException e) {
            System.out.println("Input value is not a number");
        } catch (IllegalArgumentException e) {
            System.out.println("Negative numbers don't support");
        }
    }

    @Override
    public String toString() {
        return "value for calculation='" + valueForCalc + '\'' + ", result=" + result;
    }
}
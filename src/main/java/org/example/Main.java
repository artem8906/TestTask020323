package org.example;


/* for using Calculator create it with parameter String as value for calculation and invoke getResult();
  if value is valid the result will be return as a number.
  It is possible to change value after creation Calculator. Just invoke setValueForCalc(String newValue);
  It is also possible create Calculator without value a later set it using method above
  Better way to see current state of value and result - invoke toString();
  */

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("0 6 9");
        calculator.getResult();
        System.out.println(calculator);

    }
}

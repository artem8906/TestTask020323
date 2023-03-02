package org.example;

//Using a Test Driven and Object Oriented approach, create a simple String Calculator which covers the following requirements:
//        1. adds numbers present in the input, e.g "1,2" = 3
//        2. treats empty or null input as zero, e.g "" = 0, null = 0 - done
//        3. supports different delimiters, e.g "1,2,3", "1 2 3" - done
//        4. does not support negative numbers - done
//        5. ignores numbers greater than 100 - done
//        Java SE (any version) and JUnit (any version) are the only libraries allowed.


public class Calculator {
    public static void main(String[] args) {
    }

    public static int plus(String source) {
        if (source == null || source.equals("")) return 0;
        String[] arrayOfNumbers = source.split("[^-a-zA-Z\\d]");
        int sum = 0;
        for (String number : arrayOfNumbers) {
            int a = Integer.parseInt(number);
            if (a > 100) continue;
            if (a < 0) throw new IllegalArgumentException("Negative numbers don't support");
            sum += a;
        }
        return sum;
    }

    public static void handlerAndPrintOut(String source) {
        try {
            System.out.println(plus(source));
        } catch (NumberFormatException e) {
            System.out.println("Input value is not a number");
        } catch (IllegalArgumentException e) {
            System.out.println("Negative numbers don't support");
        }
    }

}
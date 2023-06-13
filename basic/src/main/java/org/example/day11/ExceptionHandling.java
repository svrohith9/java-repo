package org.example.day11;

import java.util.Arrays;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static int getNumber(String s) throws CustomException {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            throw new CustomException("Please pass a Valid Number");
        }
    }

    public static void main(String[] args) throws CustomException {

        for (String x : Arrays.asList("23", "45.67", "test", "123f"))
            System.out.println(getNumber(x));

    }
}

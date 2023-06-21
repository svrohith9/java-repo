package org.example.day1920;

import java.util.Optional;

public class Question1 {
    public static void main(String[] args) {
        String str = "Hello";
        Optional<Integer> op1 = fetchLength(str);
        System.out.println(op1.orElse(0));
        str = "";
        Optional<Integer> op2 = fetchLength(str);
        System.out.println(op2.orElse(0));
        str = null;
        Optional<Integer> op3 = fetchLength(str);
        System.out.println(op3.orElse(0));
    }

    private static Optional<Integer> fetchLength(String str) {
        if (str == null || str.equals("")) return Optional.empty();
        return Optional.of(str.length());
    }
}

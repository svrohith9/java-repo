package org.example.day1920;

import java.util.Optional;

public class Question2 {
    public static void main(String[] args) {
        String val = null;
        Optional<String> str = Optional.ofNullable(val);
        Optional<String> upperCaseStr = getValue(str);
        System.out.println(upperCaseStr.orElse("Empty"));
        System.out.println("================================");
        val = "Hello";
        str = Optional.ofNullable(val);
        upperCaseStr = getValue(str);
        System.out.println(upperCaseStr.orElse("Empty"));
    }

    public static Optional<String> getValue(Optional<String> op) {
        if (op.isPresent()) return Optional.of(op.get().toUpperCase());
        return Optional.empty();
    }
}

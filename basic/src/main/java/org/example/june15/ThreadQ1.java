package org.example.june15;

import java.util.Arrays;

public class ThreadQ1 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        int sum = Arrays.stream(array)
                .parallel()
                .sum();

        System.out.println("Sum:" + sum);
    }
}

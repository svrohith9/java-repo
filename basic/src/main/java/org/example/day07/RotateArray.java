package org.example.day07;

import java.util.Arrays;

public class RotateArray {
    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        //no of rotations
        int x = 2;

        if (x > arr.length) x = arr.length % x;
        rotate(x);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void rotate(int x) {
        int[] duplicate = Arrays.stream(arr).toArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = duplicate[(x + i) % arr.length];
        }
    }
}

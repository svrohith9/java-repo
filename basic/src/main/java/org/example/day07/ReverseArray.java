package org.example.day07;

import java.util.Arrays;

public class ReverseArray {
    static int[] reverse(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 7, 3, 4, -5, -1};
        System.out.println("original Array");
        Arrays.stream(arr).forEach(System.out::println);
        arr = reverse(arr);
        System.out.println("After Reversing");
        Arrays.stream(arr).forEach(System.out::println);
    }
}

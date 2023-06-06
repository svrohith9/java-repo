package org.example.day07;

public class LargestAndSmallest {
    public static void largestAndSmallest(int[] arr) {
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        for (int j : arr) {
            if (lo > j) lo = j;
            if (hi < j) hi = j;
        }
        System.out.println("Low: " + lo);
        System.out.println("High: " + hi);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 7, 3, 4, 5, 67, 23, 89, 34, 5, -5, -1};
        largestAndSmallest(arr);
    }
}

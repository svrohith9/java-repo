package org.example.june16;

import java.util.Arrays;
import java.util.Comparator;

public class Streams {
    public static void main(String[] args) {

        String[] arr = new String[]{"hello", "hello2", "hellp", "hellq"};
        capitalAndSorted(arr);
        vowels(arr);

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        numbers(nums);


        sortStrings(arr);


    }

    private static void sortStrings(String[] arr) {
        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            } else {
                return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
            }
        });

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void numbers(int[] nums) {
        double result = Arrays.stream(nums)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average().orElse(0);

        System.out.println(result);
    }

    public static void capitalAndSorted(String[] arr) {
        Arrays.stream(arr).map(x ->
                Character.toUpperCase(x.charAt(0)) + x.substring(1)
        ).sorted().forEach(System.out::println);

    }

    private static void vowels(String[] arr) {
        String[] vowels = Arrays.stream(arr)
                .filter(s -> s.toLowerCase().matches(".*[aeiou].*"))
                .toArray(String[]::new);


        Arrays.stream(vowels)
                .map(s -> s.toLowerCase() + " " + s.toLowerCase().chars()
                        .filter(ch -> "aeiou".contains(String.valueOf((char) ch))).count())
                .forEach(System.out::println);

    }
}

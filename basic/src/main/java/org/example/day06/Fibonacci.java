package org.example.day06;

public class Fibonacci {
    public static void fibonacciSeries(int n) {
        int a = 0;
        int b = 1;

        if (n >= 1) System.out.println(a);
        if (n >= 2) System.out.println(b);

        while (n > 2) {
            System.out.println(a + b);
            int tmp = a + b;
            a = b;
            b = tmp;
            n--;
        }
    }

    public static void main(String[] args) {
        fibonacciSeries(10);
    }
}

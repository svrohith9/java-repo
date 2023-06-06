package org.example.day06;

public class ReverseDigits {
    static int reverse(int n) {
        boolean flag = true;
        if (n < 0) {
            n *= -1;
            flag = false;
        }

        int tmp = 0;
        while (n > 0) {
            int x = n % 10;
            tmp = tmp * 10 + x;
            n = n / 10;
        }
        return flag ? tmp : tmp * -1;
    }

    public static void main(String[] args) {
        System.out.println(reverse(0));
        System.out.println(reverse(-123));
        System.out.println(reverse(123));
        System.out.println(reverse(123456));
    }
}

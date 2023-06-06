package org.example.day06;

public class Question2 {
    public static void determineAge(int age) {
        if (age <= 0) System.out.println("Wrong info");
        else if (age < 13) System.out.println("Kid");
        else if (age <= 19) System.out.println("Teen");
        else System.out.println("Adult");
    }

    public static void main(String[] args) {
        determineAge(12);
        determineAge(-5);
        determineAge(13);
        determineAge(25);
    }
}

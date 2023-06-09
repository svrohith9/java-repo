package org.example.day08;

import java.util.ArrayList;
import java.util.List;

public class Question {
    public static void noOfVowels(String s) {
        s = s.toLowerCase();
        int ctr = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ctr++;
        }
        System.out.println("No of Vowels in \"" + s + "\" is: " + ctr);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        else {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            List<Character> list = new ArrayList<>();
            for (char c : s1.toCharArray()) list.add(c);
            for (int i = 0; i < s1.length(); i++) {
                if (list.contains(s2.charAt(i)))
                    list.remove(list.lastIndexOf(s2.charAt(i)));
                else return false;
            }
        }
        return true;
    }

    public static String revereString(String s) {
        StringBuilder stringBuilder = null;
        StringBuilder result = new StringBuilder();
        for (String x : s.split(" ")) {
            stringBuilder = new StringBuilder(x);
            result.append(stringBuilder.reverse().append(" "));
        }
        return result.substring(0, result.length() - 1);
    }

    public static boolean isRotatedString(String s, String x) {
        for (int j = 0; j < x.length(); j++) {
            if (s.substring(0, s.length() - j).equals(x.substring(j)) && s.substring(s.length() - j).equals(x.substring(0, j)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        noOfVowels("abcdefghijklmnopqrstuvwxYZAEIOU");
        System.out.println(isAnagram("Hello", "Elloh"));
        revereString("Java J2EE Reverse Me");

        System.out.println(revereString("Java J2EE Reverse Me"));

//        System.out.println(isRotatedString("abcde", "abced"));
        System.out.println(isRotatedString("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));

    }

}

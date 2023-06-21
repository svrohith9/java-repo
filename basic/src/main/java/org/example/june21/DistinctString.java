package org.example.june21;

import java.util.HashMap;

public class DistinctString {
    public static void main(String[] args) {
        String str = "test String";

        HashMap<Character, Integer> hashMap = getDistinctStringCount(str);

        hashMap.forEach((k, v) -> {
            System.out.println("'" + k + "'" + "::" + v);
        });
    }

    private static HashMap<Character, Integer> getDistinctStringCount(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : str.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        return hashMap;
    }
}

package org.example.june21;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        int target = 100;

        HashMap<Integer, Integer> result = getTargetSum(arr, target);
        if (result != null) {
            result.forEach((k, v) -> System.out.println(k + "::" + v));
        }
    }

    private static HashMap<Integer, Integer> getTargetSum(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            hashMap.put(arr[i], i + 1);

        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (hashMap.containsKey(target - e.getKey()) && (e.getValue() != hashMap.get(target - e.getKey()))) {
                return new HashMap<>() {{
                    put(0, e.getValue());
                    put(1, hashMap.get(target - e.getKey()));
                }};
            }
        }
        return null;

    }
}

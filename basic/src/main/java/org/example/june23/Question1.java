package org.example.june23;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>() {{
            add("Holley");
            add("Elvira");
            add("Enid");
            add("Ghion");
            add("Ilise");
            add("Perfitt");
            add("Simants");
            add("Susie");
            add("Sherwill");
            add("Mackenzie");
        }};

        //Using iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");

        //Using ForEach
        hashSet.forEach(System.out::println);
        System.out.println("============================");

        //Using Streams ForEach
        hashSet.stream().forEach(System.out::println);
        System.out.println("============================");


        //removeDuplicates
        String str = "ansdljkfnjaosd9824bg;sa h;HHPIUhufhb;asgnjksd";
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (char c : str.toCharArray())
            linkedHashSet.add(c);

        linkedHashSet.forEach(System.out::print);

    }
}

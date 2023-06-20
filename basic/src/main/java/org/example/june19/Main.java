package org.example.june19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(List.of(
                "hello", "welcome", "Python", "java", "javascript"
        ));

        //for loop
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
        System.out.println("====================================");

        //enhanced for loop
        for (String s : arrayList)
            System.out.println(s);
        System.out.println("====================================");

        //iterator
        Iterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("====================================");

        //forEach
        arrayList.forEach(System.out::println);
        System.out.println("====================================");

        //parallel Stream
        arrayList.parallelStream().forEach(System.out::println);
        System.out.println("====================================");


        //remove the last object in the ArrayList.
        arrayList.remove(0);

        arrayList.stream().forEach(System.out::println);
        System.out.println("====================================");


        //convert ArrayList to array
        String[] arr = arrayList.toArray(new String[0]);
        Arrays.stream(arr).forEach(System.out::println);


    }
}

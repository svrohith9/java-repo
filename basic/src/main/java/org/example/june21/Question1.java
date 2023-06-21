package org.example.june21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student {
    private final String firstName;
    private final String lastName;
    private final float gpa;

    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class Question1 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<String, Student>() {{
            put("Zora", new Student("Zora", "Holley", 1.71F));
            put("Elvira", new Student("Elvira", "Sikorsky", 3.24F));
            put("Enid", new Student("Enid", "Ghion", 3.28F));
            put("Ilise", new Student("Ilise", "Perfitt", 3.99F));
            put("Dukey", new Student("Dukey", "Simants", 2.26F));
            put("Susie", new Student("Susie", "Sherwill", 3.31F));
            put("Mackenzie", new Student("Mackenzie", "Aldritt", 2.62F));
            put("Xenia", new Student("Xenia", "Werner", 3.34F));
            put("Kyle", new Student("Kyle", "Merrett", 3.1F));
            put("Ravi", new Student("Ravi", "Loyd", 3.76F));
        }};

        //Using EntrySet
        for (Map.Entry<String, Student> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + "::" + entry.getValue());
        System.out.println("====================================================");

        //Using forEach
        hashMap.forEach((k, v) -> {
            System.out.println(k + "::" + v);
        });
        System.out.println("====================================================");

        //Using KeySet and iterator
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            System.out.println(val + "::" + hashMap.get(val));
        }
        System.out.println("====================================================");
    }
}

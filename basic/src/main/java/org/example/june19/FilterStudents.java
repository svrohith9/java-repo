package org.example.june19;

import java.util.ArrayList;
import java.util.List;

public class FilterStudents {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>(List.of(
                new Student("Zora", "Holley", 1.71F),
                new Student("Elvira", "Sikorsky", 3.24F),
                new Student("Enid", "Ghion", 3.28F),
                new Student("Ilise", "Perfitt", 3.99F),
                new Student("Dukey", "Simants", 2.26F),
                new Student("Susie", "Sherwill", 3.31F),
                new Student("Mackenzie", "Aldritt", 2.62F),
                new Student("Xenia", "Werner", 3.34F),
                new Student("Kyle", "Merrett", 3.1F),
                new Student("Ravi", "Loyd", 3.76F)));

        double avg = arrayList.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);

        arrayList.forEach(x -> {
            if (x.getGpa() >= avg)
                System.out.println(x);
        });

    }
}

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

    public float getGpa() {
        return gpa;
    }

}
package org.example.day08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String firstName;
    private String lastName;
    private float gpa;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

public class CSVReader {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("basic/src/main/java/org/example/day08/MOCK_DATA.csv"))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                list.add(new Student(str[0], str[1], Float.parseFloat(str[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.stream().sorted(Comparator.comparing(Student::getLastName)).forEach(x -> System.out.println(x.toString()));


    }
}

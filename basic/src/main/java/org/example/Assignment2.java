package org.example;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}

public class Assignment2 {
    public static void main(String[] args) {
        Student student = new Student(1, "Rohith");
        System.out.println(student.getName());

        student.setName("Rohith SV");
        System.out.println(student.getName());

    }

}

package org.example.day0405;

public class Child extends Parent{
    private String name;


    public Child(String name, int id) {
        super.setId(id);
        this.name = name;
    }

    public Child(String name) {
        this.name = name;
    }
}

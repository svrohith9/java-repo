package org.example.day0405;

public class Assignment implements Interface1, Interface2{

    @Override
    public String interface1Method() {
        return "interface1Method";
    }

    @Override
    public String interface2Method() {
        return "interface2Method";
    }

    public static void main(String[] args) {
        Assignment assignment=new Assignment();

        System.out.println(assignment.interface1Method());
        System.out.println(assignment.interface2Method());
    }
}

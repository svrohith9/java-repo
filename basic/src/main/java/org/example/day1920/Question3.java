package org.example.day1920;

import java.time.LocalDate;
import java.time.Period;

public class Question3 {
    public static void main(String[] args) {

        String birthdateStr = "1997-01-01";
        getDob(birthdateStr);
    }

    private static void getDob(String birthdateStr) {
        LocalDate birthdate = LocalDate.parse(birthdateStr);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        System.out.println(age.getYears() + "-" + age.getMonths() + "-" + age.getDays());
    }


}

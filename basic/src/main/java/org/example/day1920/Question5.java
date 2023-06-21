package org.example.day1920;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question5 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 6, 15);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        long workingDays = startDate.datesUntil(endDate.plusDays(1))
                .filter(date -> date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY)
                .count();


        System.out.println(workingDays);
    }
}

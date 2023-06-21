package org.example.day1920;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<String> dateStrings = Arrays.asList("2022-01-15", "2021-11-01", "2022-03-10", "2022-02-05", "2022-01-15", "2021-01-01", "2012-03-10", "2000-03-05");

        List<LocalDate> dates = dateStrings.stream()
                .map(LocalDate::parse)
                .toList();

        LocalDate earliestDate = dates.stream()
                .min(LocalDate::compareTo)
                .orElse(null);
        LocalDate latestDate = dates.stream()
                .max(LocalDate::compareTo)
                .orElse(null);


        System.out.println("Earliest Date: " + earliestDate);
        System.out.println("Latest Date: " + latestDate);
    }
}

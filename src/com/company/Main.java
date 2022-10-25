package com.company;


import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2000,10,10);
        System.out.println(calculateAge(birthDate,currentDate));
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}

package Exercise1;

import java.time.LocalDate;
import java.time.Period;

public class Human {

    private String firstName;                                           // Имя
    private String lastName;                                            // Фамилия
    private LocalDate birthDate;                                        // Дата рождения
    private static LocalDate currentDate = LocalDate.now();             // Текущая дата

    public Human() {}

    public Human(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public static LocalDate getCurrentDate() {
        return currentDate;
    }

    public static void setCurrentDate(LocalDate currentDate) {
        Human.currentDate = currentDate;
    }

    public int calculateAge() {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}

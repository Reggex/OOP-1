package Exercise1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Aleks","Sonul", LocalDate.of(1980,10,10));

        Scanner sc1 = new Scanner(System.in);
        Human human2 = new Human();
        System.out.print("Введите имя: ");
        human2.setFirstName(sc1.nextLine());
        System.out.print("Введите фамилию: ");
        human2.setLastName(sc1.nextLine());
        System.out.print("Введите дату рождения через пробел (YYYY MM DD): ");
        human2.setBirthDate(LocalDate.of(sc1.nextInt(),sc1.nextInt(),sc1.nextInt()));

        HumanPrint.print(human1);
        HumanPrint.print(human2);

    }
}

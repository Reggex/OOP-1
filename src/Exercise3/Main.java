package Exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Вычисляем потенциальную энергию");
        PotentialEnergy energy = new PotentialEnergy();
        System.out.println("Введите массу тела (в килограммах): ");
        System.out.println("Если это не целое число, то запишите через запятую");
        energy.setMass(sc3.nextDouble());
        System.out.println("Введите высоту нахождения тела над землёй (в метрах):");
        System.out.println("Если это не целое число, то запишите через запятую");
        energy.setHigh(sc3.nextDouble());
        energy.calculateEnergy();
    }
}

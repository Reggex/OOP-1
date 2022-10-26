package Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Для создания прямоугольного треугольника введите значения катетов:");
        RightTriangle rightTriangle = new RightTriangle(sc2.nextInt(), sc2.nextInt());
        rightTriangle.setHypotenuse(rightTriangle.calculateHypotenuse());
        System.out.print("Значение гипотенузы вашего треугольника: " + rightTriangle.getHypotenuse());
    }
}

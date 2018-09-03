package kratenok.task;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите катеты прямоугольного треугольника");
        double enterValue1;
        double enterValue2;
        double enterValue3 = scan.nextDouble();
        double enterValue4 = scan.nextDouble();
        enterValue1 = Math.sqrt( (enterValue3 * enterValue3 )+ (enterValue4 * enterValue4));
        enterValue2 = (enterValue3* enterValue4) /2;
        System.out.println("Гипотенуза:" + enterValue1);
        System.out.println("Плащадь прямоугольного треугольника:" + enterValue2);
    }
}

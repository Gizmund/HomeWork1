package kratenok.task;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два действительно положительных числа:");
        double enterValue1;
        double enterValue2;
        double enterValue3 = scan.nextDouble();
        double enterValue4 = scan.nextDouble();
        if (enterValue3 > 0 & enterValue4 > 0 ) {
            enterValue1 = (enterValue3 + enterValue4) / 2;
            System.out.println("Среднее арифметическое число: " + enterValue1);
            enterValue2 = Math.sqrt(enterValue3 * enterValue4);
            System.out.println("Среднее агеометрическое число: " + enterValue2 );

        }

    }
}
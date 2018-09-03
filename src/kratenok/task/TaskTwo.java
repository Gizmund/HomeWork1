package kratenok.task;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        if (scan.hasNextInt()) {
            int enterValue = scan.nextInt();
            int result = 0;

            if (enterValue % 2 == 0) {
                result = enterValue + 2;
            } else {
                result = enterValue + 1;
            }

            System.out.println("Результат: " + result);
        } else {
            System.out.println("Вводите целое число");


        }
    }

}



















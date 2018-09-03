package kratenok.task;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enterValue1 = (int) (Math.random()*18+2);
        int enterValue2 ;
        int enterValue3 = 0;
        System.out.println("Введите число:");
        while (enterValue3 < 5) {
            enterValue2 = scan.nextInt();
            if (enterValue1 == enterValue2) {
                System.out.println("Победа!");
            }else {
                System.out.println("Проигрыш!");
                if (enterValue1 > enterValue2){
                    System.out.println("Больше!");
                }
                if (enterValue1 < enterValue2){
                    System.out.println("Меньше!");
                }
            }
            enterValue3 ++;
        }
    }
}

package lessons;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int programNum = (int) (Math.random() * 5) + 1;
        Scanner in1 = new Scanner(System.in); // TODO: 04.03.20 внимание на обозначение новой переменной сканнера
        while (true) {
            System.out.println("Введите число");
            int num1 = in1.nextInt();
            if (num1 == 0) {
                System.out.println("Завершение работы");
                break;
            } else if (num1 > programNum) {
                System.out.println("Загадное число меньше");
            } else if (num1 < programNum) {
                System.out.println("Загаданое число больше");
                ;
            } else if (num1 == programNum) {
                System.out.println("Вы угадали");
                break;
            }
        }
    }
}

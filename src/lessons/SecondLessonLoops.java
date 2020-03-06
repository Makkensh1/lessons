package lessons;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondLessonLoops {
    public static void main(String[] args) {
        // TODO: 04.03.20 ЦИКЛЫ
//        while (условие) {
//            тело цикла
        //}
        // пользователь вводит целое число с клавиатуры
        // неоходимо вывести число * на себя
        // цикл прерывается если пользователь ввел 0


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            int num = in.nextInt(); //принятие значения введенного пользователем
            if (num == 0) {
                System.out.println("Ошибка");
                break;
            }
            System.out.println(num * num);

            //Программа загадывает число в диапазоне 1-6
            //Пользователь вводит число
            //ПРограмма в зависимости от введенного числа выводит в консоль следующее
//             загадонное число больше
//            загадонное число меньше
//            вы угадали (программа завершает работу)
//            0 выход из программы (программа завершает работу)

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


            // TODO: 04.03.20 цикл for
            //for ( инициализация; проверка условия ;обновление счетчика)
            //fori выдает стандарный шаблон
            //вывести все четные числа от 0 до 19

            for (int i = 0; i <= 19; i++) {
                if (i % 2 != 0) continue;
                else System.out.println(i);

            }
        }
    }
}











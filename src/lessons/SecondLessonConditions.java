package lessons;

import java.util.Scanner;

public class SecondLessonConditions {// TODO: 04.03.20 папка src создается по умолчанию, возможно установить папку вручную

    public static void main(String[] args) {
        // if else
        //if (условие) {выполняется условие в фигурных скобках, можно использовать одно условие т.е если нет
        // else if то программа идет дальше}
        //else if (условие 2) программа выполняет условие 2
        //else { код выполнится если не одно из вышестоящих условий не является истинной}
        // в переменной minute  лежит число от 0 до 59
        // в какую четверь часа это число
        // ответ в консоль
        //0-14 => первая четверть
        //15-30 => вторая четверть
        //31-45 => третья четверть
        //45-59 => четвертая четверть
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int minute = in.nextInt();
        System.out.printf("Вы ввели %d\n", minute);
        if (minute >= 59) {
            System.out.printf("ошибка");
        } else if (minute >= 45) {
            System.out.println("четвертая четверть");
        } else if (minute >= 31) {
            System.out.println("третья четверть");
        } else if (minute >= 15) {
            System.out.println("вторая четверть");
        } else if (minute >= 14) {
            System.out.println("первая четверть");
        } else if (minute <= 0) {
            System.out.println("error");
        }
// FIXME: 04.03.20 && ОБЪЕДИНЕНИЕ УСЛОВИЙ!!! т.е if minute >= 15 && minute <=30 как то так
// TODO: 04.03.20 ctr +alt+L выровнять код
        //switch () {}
        //int code = 222;
        // 111 / 222 / 333 малый приз
        // 444 / 555 средний приз
        // 777 крупный приз
        // попробуй еще раз
        int code = 222;
        switch (code) {
            case 111:
            case 222:
            case 333:
                System.out.println("Малый приз");
                break;
            case 444:
            case 555:
                System.out.println("Средний приз");
                break;
            case 777:
                System.out.println("Крупный приз");
                break;
            default:
                System.out.println("Попробуй еще раз");
                // TODO: 04.03.20 ДЛЯ НОВЫХ ВЕРСИЙ JDK (12, 13)есть еще один синтаксис
                //code = 123;
                //switch (code) {
                //case 111, 222, 333 -> System.out.println("Малый приз");
                //case 444, 555 -> System.out.println("Среднгий  приз");
                //case 777 -> System.out.println("Крупный приз");
                //}


                // code =123
                //String prize = switch (code) {
                //    case 111, 222, 333 -> "Малый приз";
                //    case  444, 555 -> "Средний приз";
                //   case  777 -> "Крупный приз";
                //         default -> "Попробуй еще раз"; };


//                  prize = switch (code) {
//                    case 111, 222, 333 -> "Малый приз";
//                    case  444, 555 -> "Средний приз";
//                   case  777 -> "Крупный приз";
//                         default -> {
//                 String someRes = "Попробуй еще раз";
//                 yield someRes; для JDK 13
                // break someRes; для JDK 12 }


        }
    }
}





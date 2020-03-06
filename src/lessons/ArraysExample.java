package lessons;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
//        Оъявление переменной массива int [] "Name"
        int[] someArr; //предпочтительный вариант
        // int someArr1 []; // c-Style
        someArr = new int[7]; // массив объявляется с элементами по умолчанию, для целых чисел это 0,
        // для булевых типов это false, для ссылочных типов это num
        //System.out.println(someArr); так не получится
        System.out.println(Arrays.toString(someArr)); //java util подлючается
        // TODO: 06.03.20 ВЫВОД МАССИВА через Arrays.toString!!!1
        int[] someArr2 = {37, 48, 125, 983, -23, 0, -112}; //первая ячейка массива имеет индекс 0

        //размер массива нельзя изменить, но можно узнать
        System.out.println(someArr.length);
        System.out.println(someArr2.length); //lenght чтобы узнать длину массива
        // доступ к элементам массива
        System.out.println(someArr2[4]);
        System.out.println(someArr2[1 + 2]); //результат вычесления в квадратных скобках должен быть инт 983 складывает не сами элементы а из номера
        System.out.println(someArr2[1] + someArr2[6]); //складывание самих элемнтов массива
        //System.out.println(someArr2[123]); будет ошибка т.к нет элемента под данным индексом
        someArr[2] = 456;
        System.out.println(Arrays.toString(someArr));
        // FIXME: 06.03.20 ПЕРЕОПРЕДЕЛЕНИЕ МАССИВА (МОЖНО МЕНЯТЬ ДЛИНУ)
        someArr = new int[23];
        someArr2 = new int[]{23, 1, -10, 5};
        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] *= 2;
        }
        System.out.println(Arrays.toString(someArr2));
        // TODO: 06.03.20 цикл для перебора массива
        someArr2 = new int[]{23, 1, -10, 5};
        for (int elem : someArr2) {
            elem *= 2;
            System.out.println(elem);
        }
        // TODO: 06.03.20 программа выше еребирает каждый элемент массива записывает его как elem и проводит операцию не трогая сам массив
        System.out.println(Arrays.toString(someArr2));

        // TODO: 06.03.20 коппирование массивов

        someArr2 = new int[]{23, 1, -10, 5};
        // int[]arr = someArr2;  копированием не является в данном случае это ссылка или еще одно имя
        int [] cloneArr = someArr2.clone(); //клонирование массива команда ".clone"

        // TODO: 06.03.20 2ой вариант копирует из массива someArr2 в массив someArr, изменяет существующий
        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int [15];
        System.arraycopy(someArr2, 1, someArr, 3, 2);
        //System.arraycopy("имя массива", "индекс с которого начнется копирование", "в какой массив скопировать", "позиция в втором массиве в который начнется копирование", "количество элементов");
        System.out.println(Arrays.toString(someArr));

        // TODO: 06.03.20 еще один метод копирования массивов

        int [] copyArr = Arrays.copyOf(someArr2,3);  // создает массив в 3 элемента начиная с 0
        System.out.println(Arrays.toString(copyArr));


        // TODO: 06.03.20 сравнение массивов через оператор == не сравнить

        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[]{23, 1, -10, 5};
        // someArr.equals(someArr2) так не выйдет
        System.out.println(Arrays.equals(someArr,someArr2)); // происходит сравнение массивов

        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[]{12, -10, 123, 6};
        int [] someArr3 = new int[4]; //вместо 4 можно записать someArr.lenght тогда длина someArr3 = длине someArr

        for (int i=0; i<someArr.length; i++) {
            someArr3[i]= someArr2[i] + someArr [i];
                    }
        System.out.println(Arrays.toString(someArr3));

// TODO: 06.03.20 сортировка массивов

        someArr = new int[]{12, -10, 123, 6};
        Arrays.sort(someArr); // Arrays.sort (arr, 1, 5) сортирует с 1 по 5
        System.out.println(Arrays.toString(someArr));
//алгоритм быстрой сортировки , сложность 0 (n Log n)

        // TODO: 06.03.20 поиск по массивам  бинарный поиск сложность 0  (Log n)

        someArr = new int[]{-10, 6, 12, 123};
        System.out.println(Arrays.binarySearch(someArr, 6)); // массив должен быть отсортирован
        System.out.println(Arrays.binarySearch(someArr, 15)); // возвращает с индексом +1 знак минус означает что его нет

        int [][]newArr = new int [3][4];
        System.out.println(Arrays.deepToString(newArr));

        int [][] newArr2 = {{1, 2, 3}, {4, 5,}, {7}};
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr2[0][2]); //3
        System.out.println(newArr2[1][1]); //5
        for (int i=0; i<newArr2.length;i++) {
            for (int j = 0; j < newArr2[i].length; j++) {
                newArr2[i][j] *= newArr2[i][j]; // где второе слогаемое
            }
        }
        System.out.println(Arrays.deepToString(newArr2));
    }
}





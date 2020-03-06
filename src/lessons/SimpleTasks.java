package lessons;

import java.util.Scanner;

public class SimpleTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int chislo1 = in.nextInt();
        int a = chislo1 / 100;
        int b = (chislo1 - (a * 100))/10;
        int c = (chislo1 - (a*100)-(b*10));
        System.out.println(a+b+c);
    }
}

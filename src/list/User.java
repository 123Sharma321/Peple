package list;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        int abc = 0;
        //      kv1
        int[] arr = {3, 22, 11, 7};
        double result = 1;
        for (int i = 0; i < 4; i++) {
            result = result + arr[i];
        }
        result = result / 4;
        System.out.println("Среднее = " + result);
//kv2 factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("chislo");
        int factorial = scanner.nextInt();
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println("factorial = " + result);
        // Выводит цену за определенный товар
        System.out.println("Выберите 1 товар из предложеных\n1.Огурец\n2.Помидор\n3.Шпинат\n--> <--");
        while (true) {
            try {
                abc = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ЗАЕБАЛ");
            }
        }

        while (true) {

            if (abc == 1) {
                System.out.println("Цена огурца 2 шекеля!");
                break;
            } else if (abc == 2) {
                System.out.println("Цена помидора 4 шекеля!");
                break;
            } else if (abc == 3) {
                System.out.println("Цена шпината 2.5 шекеля!");
                break;
            } else while (true) {
                try {
                    System.out.println("Ты че дурак? Попробуй еще раз!");
                    abc = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("ЗАЕБАЛ");
                }
            }
        }


    }
}


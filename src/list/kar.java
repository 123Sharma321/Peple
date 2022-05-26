package list;

import java.util.Arrays;
import java.util.Scanner;

public class kar {
    public static void main(String[] args) {
        // Поменял элементы массива местами
        int[] numbers = {3, 9, 11, 15};
        int a = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = a;
        System.out.println(Arrays.toString(numbers));
        // proverka chetnosti
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПроверка четности чисел. Введи число");
        b = scanner.nextInt();
        if (b % 2 == 0) {
            System.out.println(b + " четное");
        } else System.out.println(b + " нечетное");
        // perevod masiva v bool
        int[] j = {12, 13, 14, 11, 15};
        boolean[] n = new boolean[j.length];
        for (int i = 0; i < j.length; i++) {
            if (j[i] % 2 == 0) {
                n[i] = true;
            } else n[i] = false;
            System.out.print(n[i] + " ");
        }
    }
}

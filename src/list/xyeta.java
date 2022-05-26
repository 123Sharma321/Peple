package list;

import java.util.Arrays;

public class xyeta {
    public static void main(String[] args) {
        //ввывод элементов массива
        int[] xyi = {11, 12, 13, 14, 15, 15, 16};
        for (int i = 0; i < xyi.length; i++) {
            System.out.println(xyi[i]);
        }
        System.out.println(Arrays.toString(xyi));
        // присвоение элементу масива знак
        String xyi1 = "pidaras";
        char[] result = xyi1.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println("element [ " + i + " ]: " + result[i]);
        }
        // присвоение элементам массива строки
        int[] xyi2 = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] str = new String[5];
        for (int i = 0; i < 5; i++) {
            str[i] = i + " Pidaras";
            System.out.print(str[i] + " ");
        }
    }
}

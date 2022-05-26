package random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //монетка
        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println(a);
        if (a >= 50) {
            System.out.println("Решко");
        } else
            System.out.println("Орел");

    }

}

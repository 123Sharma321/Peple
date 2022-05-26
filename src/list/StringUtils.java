package list;

import java.util.Random;

public class StringUtils {
    public static void main(String[] args) {
        Random rand = new Random();
        int time = rand.nextInt(24);
        System.out.println(time);
        int money = rand.nextInt(100);
        System.out.println(money);
        while (true) {
            if (time > 6 && time < 12 && money > 10) {
                System.out.println("idi v magaz");
                break;
            } else if (time >= 12 && time <= 14 && money > 50) {
                System.out.println("go v kafe");
                break;
            } else if (time > 14 && time <= 19 && money < 50) {
                System.out.println("go byhat' k sosedy");
                break;
            } else if (time > 19 && time <= 22 && money < 10) {
                System.out.println("zalipai v telek");
                break;
            } else System.out.println("pizdyi spat'");
            time = rand.nextInt(24);
            System.out.println(time);
            money = rand.nextInt(55);
            System.out.println(money);
        }
    }
}
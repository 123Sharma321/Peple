package list;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // аккаунты
        String login1;
        String pas1;
        String login2;
        String pas2;
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Первый пользователь");
        System.out.println("Введите логин");
        login1 = scan.nextLine();
        System.out.println("Введите пароль");
        pas1 = scan.nextLine();
        System.out.println("Второй пользователь");
        System.out.println("Введите логин");
        login2 = scan.nextLine();
        System.out.println("Введите пароль");
        pas2 = scan.nextLine();
        System.out.println("Выберите имя пользователя");
        a = scan.nextLine();
        while (true) {
            if (login1.equals(a)) {
                System.out.println("Введите пароль");
                String b = scan.nextLine();
                while (!pas1.equals(b)) {
                    System.out.println("Ты не тот мудак");
                    b = scan.nextLine();
                }
                System.out.println("Ну привет пидр!");
                return;
            } else if (login2.equals(a)) {
                System.out.println("Введите пароль");
                String b = scan.nextLine();
                while (!pas2.equals(b)) {
                    System.out.println("Ты не тот мудак");
                    b = scan.nextLine();
                }
                System.out.println("Ну привет пидр!");
                return;
            } else System.out.println("Xyevii login, escho");
            a = scan.nextLine();
        }
    }
}





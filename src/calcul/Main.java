package calcul;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // калькулятор
        double otvet;
        String znak = "";
        double a = 0;
        double b = 0;
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                a = new Scanner(System.in).nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ЗАЕБАЛ");
            }
        }
        System.out.println("Введите второе число");
        while (true) {
            try {
                b = new Scanner(System.in).nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ЗАЕБАЛ");
            }
        }
        System.out.println("Что вы хотите сделать :'+','-','*','/'");
        znak = scanner.next();
        switch (znak) {
            case "+":
                otvet = a + b;
                break;
            case "-":
                otvet = a - b;
                break;
            case "*":
                otvet = a * b;
                break;
            case "/":
                otvet = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + znak);
        }
        System.out.println("Продолжить Y. Ответ N");
        String yN = scanner.next();
        switch (yN.toUpperCase(Locale.ROOT)) {
            case "Y":
                System.out.println("Что вы хотите сделать :'+','-','*','/'");
                break;
            case "N":
                System.out.println("Ответ " + otvet);
                return;
        }
        znak = scanner.next();
        System.out.println("Введите число");
        b = scanner.nextDouble();
        switch (znak) {
            case "+":
                otvet = otvet + b;
                break;
            case "-":
                otvet = otvet - b;
                break;
            case "*":
                otvet = otvet * b;
                break;
            case "/":
                otvet = otvet / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + znak);
        }
        System.out.println("Продолжить Y. Ответ N");
        yN = scanner.next();
        switch (yN.toUpperCase(Locale.ROOT)) {
            case "Y":
                System.out.println("Какое действие вы хотите сделать");
                break;
            case "N":
                System.out.println("Ответ " + otvet);
                return;
        }
    }
}





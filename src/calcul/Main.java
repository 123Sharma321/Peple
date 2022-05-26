package calcul;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // калькулятор
        double otvet;
        String znak;
        double a ;
        double b ;
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
        otvet = switch (znak) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalStateException("Unexpected value: " + znak);
        };
        System.out.println("Продолжить Y. Ответ N");
        String yN = scanner.next();
        switch (yN.toUpperCase(Locale.ROOT)) {
            case "Y" -> System.out.println("Что вы хотите сделать :'+','-','*','/'");
            case "N" -> {
                System.out.println("Ответ " + otvet);
                return;
            }
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
        }
    }
}





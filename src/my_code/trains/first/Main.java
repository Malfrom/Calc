package my_code.trains.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите операцию\n1) Сложение\n2) Вычитание\n3) Умножение\n4) Деление");

        int operation = new Scanner(System.in).nextInt();

        if (operation < 1 || operation > 4) {
            System.out.println("Введена некорректная операция");
            return;
        }

        System.out.println("Введите число a");
        float a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b");
        float b = new Scanner(System.in).nextInt();

        System.out.println("Результат: " + (((a + b) * coeficient(1, operation)) +
                ((a - b) * coeficient(2, operation)) +
                ((a * b) * coeficient(3, operation)) +
                ((a / b) * coeficient(4, operation))));
    }

    static int coeficient(int value, int param) {
        return value == param ? 1 : 0;
    }
}

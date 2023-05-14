package ru.seliverstov;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        task1();

        //int result = task2("aabbcd","ab");
        //System.out.println(result);

    }

    /**
     * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void task1() {
        int ask;
        do {
            Random rand = new Random();
            int guess = rand.nextInt(10);
            System.out.println(guess);
            Scanner sc = new Scanner(System.in);
            int tryCount = 3;
            do {
                System.out.println("Введите число");
                int answer = sc.nextInt();
                if (guess == answer) {
                    System.out.println("Вы угадали заданное число");
                    break;
                } else if (answer < guess) {
                    System.out.println("Загаданное число больше, чем введенное");
                } else {
                    System.out.println("Загаданное число меньше, чем введенное");
                }
                tryCount = tryCount - 1;
            } while (tryCount > 0);
            System.out.println("Повторить игру еще раз, 0 - false, 1 - true");
            ask = sc.nextInt();
        } while (ask == 1);
    }

    /**
     * Даны две строки строчных латинских символов: строка J и строка S.
     * Символы, входящие в строку J, — «драгоценности»,
     * входящие в строку S — «камни». Нужно определить, какое количество символов из S одновременно
     * являются «драгоценностями». Проще говоря, нужно проверить, какое количество символов из S входит в J.
     */
    // J = "aabbcd";
    // S = "ab"
    public static int task2(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }
}


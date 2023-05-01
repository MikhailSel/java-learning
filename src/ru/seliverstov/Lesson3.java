package ru.seliverstov;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        task1();
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
}


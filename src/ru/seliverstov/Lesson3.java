package ru.seliverstov;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        test1();


    }

    /**
     * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    public static void test1() {
        Random rand = new Random();
        int a = rand.nextInt(10);
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int b = sc.nextInt();
        if (a - b > 0) {
            System.out.println("Загаданное число меньше, чем введенное");
        } else if (a - b < 0) {
            System.out.println("Загаданное число больше, чем введенное");
        } else if (a - b == 0) {
            System.out.println("Вы угадали загаданное число");
        }
        System.out.println("Введите число заново");
    }
}


package ru.seliverstov.lessons;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[][] doubleArray = {
                {1, 3, 9},
                {12, 15, 18},
                {21, 24, 27}
        };
        //printDoubleArray(doubleArray);
        //task4();
        //task5();
        //task6();

        boolean result = task7(1, new int[]{1, 2, 5});
        System.out.println(result);
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
     */
    public static void task3(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printDoubleArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n]
     */
    public static void task4() {
        int[][] table = new int[5][5];
        int l;
        l = table.length - 1;
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l; j++) {
                if ((i == j) || (j == l - i)) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    public static void task5() {
        int[] arr = new int[]{3, 2, 150, 1000};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]) < min) {
                min = arr[i];
            } else if ((arr[i]) > max) {
                max = arr[i];
            }
        }
        System.out.println("максимальное значение - " + max);
        System.out.println("минимальное значение - " + min);
    }

    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
     * граница показана символами ||, эти символы в массив не входят.
     */

    public static void task6() {
        int[] arr = new int[]{2, 2, 2, 6};
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0, j = 4; i < arr.length && j < arr.length; i++, j--) {
            rightSum += arr[i];
            leftSum += arr[j];
        }
        System.out.println(rightSum);
        System.out.println(leftSum);
    }

    /**
     * Написать метод, который возвращает true,
     * если в массиве есть 2 элемента, сумма которых = target
     */

    public static boolean task7(int target, int[] arr) {
        // 3,3,3,2,1 target 3
        // 1,2,5,    target 7
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return true;
                }
            }
        }
        return false;
    }
}



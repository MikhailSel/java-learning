package ru.seliverstov.exercise;

import java.util.Scanner;

//2. + Выяснить сколько из значений массива превышает число z.X +
//3. + Найти максимальную сумму двух соседних чисел в массиве {2,3,4,4,3,6,7}.
//4. + Найти количество значений массива,которые меньше своего левого соседа.
//5. + Проверить образует ли массив возрастающую или убывающую последовательность.
//6. + Найти среднее арифметическое значение массива и вернуть в качестве возвращаемого значения количество элементов, превышающих среднее арифметическое.
//7. + Каждый элемент массива с индексом кратным 4 умножить на собственный индекс.
//   + Дан одномерный массив a из n элементов:
//8. + Определить количество тех элементов, которые без остатка делятся на собственный номер (индекс + 1).
//9. + Определить количество тех элементов, стоящих на четных позициях, которые сами четны.
//10. Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
//11. Example 2: Input: s = ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]

//{1,2,3,4,5,6,7}, {7,6,5,4,3,2,1} z = 3 Ответ = 4

import java.util.Arrays;
import java.util.Scanner;

public class Execrcise {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        int[] b = new int[1];
        b[0] = 2;
        int[] result = sumVectors(a, b);
        System.out.println(Arrays.toString(result));
    }

    public static int task8(int[] args, int z) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > z) {
                result++;
            }
        }
        return result;
    }

    public static int task6(int[] args) {
        int result = 0;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        double average = sum / args.length;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > average) {
                result = result + 1;
            }
        }
        return result;
    }

    public static int task3(int[] args) {
        int result = 0;
        int sum;
        for (int i = 0; i < args.length - 1; i++) {
            sum = args[i] + args[i + 1];
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }

    //7,6,5,4,3,2,1
    public static boolean task5_1(int[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] > args[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean task5_2(int[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] < args[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //7,6,5,4,3,2,1
    //4. Найти количество значений массива,которые меньше своего левого соседа.
    public static int task4(int[] args) {
        int result = 0;
        for (int i = 1; i < args.length; i++) {
            if (args[i] < args[i - 1]) {
                result = result + 1;
            }
        }
        return result;
    }

    //7. Каждый элемент массива с индексом кратным 4 умножить на собственный индекс. Но элемент массива с индексом кратным 12 не надо умножать.
    // 7,6,5,4,3,2,1,7,6       7,6,5,4,12,2,1,7,48      0, 6, 5, 4, 12, 2, 1, 7, 48   7,6,5,4,12,2,1,7,48,7,6,5,4,3,2,1,112,6
    public static int[] task7(int[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i % 4 == 0 && i % 12 != 0) {
                args[i] = args[i] * i;
            }
        }
        return args;
    }

    // 8. Определить количество тех элементов, которые без остатка делятся на собственный номер (индекс + 1). 7 (1),6 (2),5,4 (3),3,2,1,7,6

    public static int task8(int[] args) {
        int numberDivide = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] % (i + 1) == 0) {
                numberDivide = numberDivide + 1;
            }
        }
        return numberDivide;
    }

    //9. Определить количество тех элементов, стоящих на четных позициях, которые сами четны. 7,6,5,4,12,2,1,7,48

    public static int task9(int[] args) {
        int result = 0;
        for (int i = 2; i < args.length; i++) {
            if (i % 2 == 0 && args[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }
    //10. Input: s = ['h','e','l','l','0'] Output: ['o','l','l','e','h'] [0, l, l, l, 0]

    public static char[] task10(char[] args) {
        for (int i = 0; i < args.length; i++) {
            char temp = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = temp;
        }
        return args;

    }

    //   while left < right:
//        Do some logic here depending on the problem
//        Do some more logic here to decide on one of the following:
//            1. left++
//            2. right--
//            3. Both left++ and right--
//    Example 1: Given a string s, return true if it is a palindrome, false otherwise.
    //    A string is a palindrome if it reads the same forward as backward. That means, after reversing it, it is still the same string. For example: "abdccba", or "racecar".
    public static boolean isPalindrom(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
//Example 2: Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
//
//For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
//
//1 + 15 = 16   >   13
//1 + 14 = 15   >   13
//1 + 9 = 10   <    13
//2 + 9 = 11   <    13
//4 + 9 == 13

    public static boolean twoSum(int[] args, int target) {
        int left = 0;
        int right = args.length - 1;
        while (left < right) {
            int temp = args[left] + args[right];
            if (temp == target) {
                return true;
            }
            if (temp > target) {
                right--;
            } else if (temp < target) {
                left++;
            }
        }
        return false;
    }

//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//Example 2:
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]

    public static void reverseArray(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }

    //Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x", а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
    //Вывести на экран номер координатной четверти, в которой находится данная точка.
    //
    //Подсказка:
    //Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:
    //
    //для первой четверти x>0 и y>0;
    //для второй четверти x<0 и y>0;
    //для третьей четверти x<0 и y<0;
    //для четвертой четверти x>0 и y<0.
    //Пример для чисел 4 6:
    //1
    //Пример для чисел -6 -6:
    //3
    //Требования:
    //•  Программа должна считывать два числа c клавиатуры.
    //•  Программа должна использовать команду System.out.println() или System.out.print().
    //•  Если точка находится в первой координатной четверти, вывести "1".
    //•  Если точка находится во второй координатной четверти, вывести "2".
    //•  Если точка находится в третей координатной четверти, вывести "3".
    //•  Если точка находится в четвёртой координатной четверти, вывести "4".
    public static void coordinate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X");
        int x = scanner.nextInt();
        System.out.println("Введите Y");
        int y = scanner.nextInt();
        if (x > 0 & y > 0) {
            System.out.println("1");
        }
        if (x < 0 & y > 0) {
            System.out.println("2");
        }
        if (x < 0 & y < 0) {
            System.out.println("3");
        }
        if (x > 0 & y < 0) {
            System.out.println("4");
        }
    }

//Написать метод, который принимает два вектора одного размера (целочисленные массивы),
// и выводит новый массив, элементы которого равны сумме двух других элементов на тех же позициях
// [1,2,3,4] и [2,5,7,6,5,4] = [3,7,10,10,5]
// [3,7,10,10,0,0]
// [1,2,3] и [1,2,3,4,5]
//// [1,2,3,0,0]
// 1. Определить, какой из массивов больше по размеру;
// 2. По нему проитерироваться;
// 3. Запишем в новый массив полученные значения;
// 4. Определить с какого индекса по большому массиву мы должны идти, чтобы записать незаполненные элементы в новом массиве;
// 5. Заполнить новый массив недостающими элементами из большого массива
// 6. Если а больше чем б, то
// 7. Если б больше чем а, то

    // Реализовать библиотеку
    // 1) Добавление книги в библиотеку
    // 2) Регистрация пользователя
    // 3) Выдача книги пользователю на определенный срок (можно выдавать только тем, кто уже зарегистрирован)
    // 4) При выдаче книге, ее нельзя выдать другому пользователю, пока ее не вернут
    // 5) Возврат книги. При возврате книге, если превышен срок возврата книги, взыскать штраф;



    public static int[] sumVectors(int[] a, int[] b) {
        int max = Math.max(a.length, b.length);
        int min = Math.min(a.length, b.length);
        int[] c = new int[max];
        for (int i = 0; i < min; i++) {
            int temp1 = a[i] + b[i];
            c[i] = temp1;
        }
        if (a.length > b.length) {
            for (int i = min; i < max; i++) {
                c[i] = a[i];
            }
        } else {
            for (int i = min; i < max; i++) {
                c[i] = b[i];
            }
        }
        return c;
    }
}




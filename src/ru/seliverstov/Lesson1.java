package ru.seliverstov;

public class Lesson1 {
    public static void main(String[] args) {
        //float calcResult = calculate(3.3f,3.2f, 3.3f,3.4f);
        // System.out.println(calcResult);
        //float calcResultSecond = calculate(2.1f,2.2f, 2.3f,2.4f);
        //System.out.println(calcResultSecond);
        //System.out.println("isBetweenFalse: " + isBetween10and20(10,20) + " isBetweenTrue: " + isBetween10and20(10,5));
        //printIsPositive(3);
        //printIsPositive(-2);
        //printName("Мишган");
        //printYear(2100);
        // test(123);
        //task1();
        //task2();
    }

    /**
     * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – аргументы этого метода, имеющие тип float
     *
     * @param a вводимый параметр;
     * @param b вводимый параметр;
     * @param c вводимый параметр;
     * @param d вводимый параметр;
     * @return результат;
     */
    public static float calculate(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно)
     *
     * @param a число
     * @param b число
     * @return правда или ложь
     */
    public static boolean isBetween10and20(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом
     *
     * @param a число
     * @return результат
     */
    public static void printIsPositive(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным");
        } else {
            System.out.println("Число " + a + " является отрицательным");
        }
    }

    /**
     * Написать метод, которому в качестве параметра передается строка,
     * обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     *
     * @param name ввести имя
     */
    //
    public static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
     *
     * @param year - ввести в год
     */
    public static void printYear(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void test(int num) {
        for (int i = num; i >= -5; i = i - 3) {
            System.out.println(i);
        }
    }


}

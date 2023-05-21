package ru.seliverstov.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Employee employee1;
        //employee1 = new Employee("Селиверстов Михаил",
        //        "Должность",
        //        "seliverstov8@yandex.ru",
        //        "89025832363",
        //        1000,
        //        29);
        //employee1.info();
        // Employee employee2 = new Employee();
        //employee2.info();

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван Иванович",
                "Директор",
                "72@mail.ru",
                "89026556454",
                1500,
                30);

        employeeArray[1] = new Employee("Петров Петр Петрович",
                "Руководитель отдела логистики",
                "96@mail.ru",
                "89506556454",
                1200,
                39);

        employeeArray[2] = new Employee("Сидоров Максим Иванович",
                "Руководитель финансового отдела",
                "69@mail.ru",
                "89916556454",
                1300,
                54);

        employeeArray[3] = new Employee("Аристов Владимир Максимович",
                "Руководитель отдела доставки",
                "74@mail.ru",
                "89836556454",
                800,
                45);

        employeeArray[4] = new Employee("Бусов Василий Германович",
                "Руководитель отдела качества",
                "45@mail.ru",
                "89896556454",
                650,
                40);

    }

    public static void employeeInfo() {
        for (Employee employee;;);
        if (Employee.getAge()>40);
        System.out.println();

    }
}


}

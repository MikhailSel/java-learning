package ru.seliverstov.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Employee() {
        this.fullName = "Иванов Иван";
        this.position = "стандартная должность";
        this.email = "default@mai.ru";
    }

    public void info() {
        System.out.println("fullName " + this.fullName + " position " + this.position +
                " email " + this.email + " phoneNumber " + this.phoneNumber
                + " salary " + this.salary + " age " + this.age);
    }

    public int getAge() {
        return age;
    }
    public static void employeeInfo() {
        for (Employee employee;;);
        if (Employee.getAge()>40);
        System.out.println(employee);

}

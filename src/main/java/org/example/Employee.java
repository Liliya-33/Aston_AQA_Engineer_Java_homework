package org.example;

public class Employee {
    String full_name;
    String job_title;
    String email;
    String phone;
    int salary;
    int age;

    public void infoEmployee() {
        System.out.printf("ФИО сотрудника: " + full_name + "\n" + "Должность: " + job_title + "\n" +
        "Электронная почта: " + email + "\n" + "Телефон: " + phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age
        );
    }

}

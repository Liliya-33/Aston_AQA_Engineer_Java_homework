package org.example.lesson6;

import java.math.BigDecimal;

public class Employee {
    private String full_name;
    private String job_title;
    private String email;
    private String phone;
    private BigDecimal salary;
    int age;

    public void infoEmployee() {
        System.out.printf("\n" + "//Первое задание: " + "\n" + "ФИО сотрудника: " + full_name + "\n" + "Должность: " + job_title + "\n" +
        "Электронная почта: " + email + "\n" + "Телефон: " + phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age + "\n" + "\n"
        );
    }
}

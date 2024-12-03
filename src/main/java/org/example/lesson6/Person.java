package org.example.lesson6;

import java.math.BigDecimal;

public class Person {
    private String full_name;
    private String job_title;
    private String email;
    private String phone;
    private BigDecimal salary;
    private int age;

    public Person(String full_name, String job_title, String email, String phone, double salary, int age) {
        this.full_name = full_name;
        this.job_title = job_title;
        this.email = email;
        this.phone = phone;
        this.salary = new BigDecimal(salary);
        this.age = age;
    }

    public String getFullName() {
        return this.full_name;
    }

    public String getJobTitle() {
        return this.job_title;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void infoPersons() {
        System.out.println("\n" + "ФИО: " + full_name);
        System.out.println("Должность: " + job_title);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}

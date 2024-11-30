package org.example;

public class Person {
    String full_name;
    String job_title;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.full_name = fullName;
        this.job_title = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void infoPersons() {
        System.out.println("//Второе задание:");
        System.out.println("ФИО: " + full_name);
        System.out.println("Должность: " + job_title);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }


}

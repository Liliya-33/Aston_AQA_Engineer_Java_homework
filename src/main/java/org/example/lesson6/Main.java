package org.example.lesson6;

public class Main {
    public static void main(String[] args) {
        //Урок 6
        //Первое задание
        Employee employee1 = new Employee();
        employee1.full_name = "Иванов Иван Иванович";
        employee1.job_title = "Старший разработчик";
        employee1.email = "ivanov@mail.ru";
        employee1.phone = "8 999 676 56 56";
        employee1.salary = 200000;
        employee1.age = 25;
        employee1.infoEmployee();

        //Второе задание
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Петров Петр Петрович", "Ручной тестировщик", "petrov@mail.ru", "8 987 654 65 56", 70000, 20);
        personArray[1] = new Person("Сергеев Сергей Сергеевич", "Автоматизированный тестировщик", "sergeev@mail.ru", "8 987 354 25 26", 180000, 27);
        personArray[2] = new Person("Марков Марк Маркович", "Младший разработчик", "markov@mail.ru", "8 987 604 45 52", 170000, 30);
        personArray[3] = new Person("Кириллов Кирилл Кириллович", "Руководитель отдела разработки", "kirillov@mail.ru", "8 987 624 25 55", 230000, 23);
        personArray[4] = new Person("Матвеев Матвей Матвеевич", "Руководитель проектов", "matveev@mail.ru", "8 987 644 45 54", 350000, 35);

        for (Person person : personArray) {
            person.infoPersons();
            System.out.println();
        }

        //Третье задание
        Park.Attractions atrraction1 = new Park() .new Attractions();
        Park.Attractions atrraction2 = new Park() .new Attractions();
        Park.Attractions atrraction3 = new Park() .new Attractions();
        atrraction1.name = "Колесо обозрения";
        atrraction1.work_schedule = "12:00 - 00:00";
        atrraction1.price = 500;
        atrraction2.name = "Комната страха";
        atrraction2.work_schedule = "10:00-20:00";
        atrraction2.price = 350;
        atrraction3.name = "Американские горки";
        atrraction3.work_schedule = "09:00-21:00";
        atrraction3.price = 700;

        atrraction1.infoAttractions();
        atrraction2.infoAttractions();
        atrraction3.infoAttractions();

    }
}





package org.example.lesson6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        Person person1 = new Person("Иванов Иван Иванович", "Старший разработчик", "ivanov@mail.ru", "8 999 676 56 56", 200000.3, 25);
        System.out.println("//Первое задание: ");
        person1.infoPersons();


        // Второе задание
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Петров Петр Петрович", "Ручной тестировщик", "petrov@mail.ru", "8 987 654 65 56", 70000, 20);
        personArray[1] = new Person("Сергеев Сергей Сергеевич", "Автоматизированный тестировщик", "sergeev@mail.ru", "8 987 354 25 26", 180000, 27);
        personArray[2] = new Person("Марков Марк Маркович", "Младший разработчик", "markov@mail.ru", "8 987 604 45 52", 170000, 30);
        personArray[3] = new Person("Кириллов Кирилл Кириллович", "Руководитель отдела разработки", "kirillov@mail.ru", "8 987 624 25 55", 230000, 23);
        personArray[4] = new Person("Матвеев Матвей Матвеевич", "Руководитель проектов", "matveev@mail.ru", "8 987 644 45 54", 350000, 35);

        System.out.println("\n" + "//Второе задание: ");
        for (Person person : personArray) {
            person.infoPersons();
            System.out.println();
        }

        //Третье задание
        Park.Attractions atrraction1 = new Park() .new Attractions("Колесо обозрения", "12:00 - 00:00", 500);
        Park.Attractions atrraction2 = new Park() .new Attractions("Комната страха", "10:00-20:00", 350);
        Park.Attractions atrraction3 = new Park() .new Attractions("Американские горки", "09:00-21:00", 700);

        System.out.println("//Третье задание: " + "\n");
        atrraction1.infoAttractions();
        atrraction2.infoAttractions();
        atrraction3.infoAttractions();

    }
}





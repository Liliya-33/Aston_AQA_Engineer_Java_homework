package org.example.lesson10_1;

public class Main {
    public static void main(String[] args) {
        // Создаем миску с едой
        Bowl foodBowl = new Bowl(20);

        // Создаем собак и котов
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Василиса");

        // Коты пытаются поесть
        cat1.eat(foodBowl, 10);
        cat2.eat(foodBowl, 15);

        // Проверка сытости котов
        System.out.println(cat1.name + " сытость: " + cat1.isFullness());
        System.out.println(cat2.name + " сытость: " + cat2.isFullness());

        // Бег и плавание
        dog1.run(150);
        dog1.swim(5);
        cat1.run(100);
        cat1.swim(10);
        cat2.run(250);

        // Общее количество животных
        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
    }
}
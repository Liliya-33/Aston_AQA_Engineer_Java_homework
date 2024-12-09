package org.example.lesson10;

public class Main {
    public static void addFood(int amount) {
        Cat.foodBowl += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + Cat.foodBowl + " еды.");
    }

    public static void main(String[] args) {
        // Создаем собак и котов
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Василиса");

        // Добавляем еду в миску
        addFood(20);

        // Коты пытаются поесть
        cat1.eat(10);
        cat2.eat(15);


        // Проверка сытости котов
        System.out.println(cat1.name + " сытость: " + cat1.isFullness());
        System.out.println(cat2.name + " сытость: " + cat2.isFullness());

        // Бег и плавание
        dog1.run(150);
        dog1.swim(5);
        cat1.run(100);
        cat1.swim(10); // Кот не умеет плавать
        cat2.run(250);

        // Общее количество животных
        System.out.println("Общее количество животных: " + Animal.getCount());
    }
}
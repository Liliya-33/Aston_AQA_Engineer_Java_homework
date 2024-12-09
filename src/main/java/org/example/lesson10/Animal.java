package org.example.lesson10;

public class Animal {
    private static int count = 0; // Общее количество животных
    protected String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        System.out.println("Животное может бегать");
    }

    public void swim(int distance) {
        System.out.println("Животное может плавать");
    }

    public static int getCount() {
        return count;
    }
}

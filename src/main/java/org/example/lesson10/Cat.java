package org.example.lesson10;

public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        } else {
            System.out.println(this.name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance == MAX_SWIM_DISTANCE || distance > MAX_SWIM_DISTANCE || distance < MAX_SWIM_DISTANCE) {
            System.out.println(this.name + " не умеет плавать.");
        }
    }
}

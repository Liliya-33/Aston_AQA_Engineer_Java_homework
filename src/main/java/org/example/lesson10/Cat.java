package org.example.lesson10;

public class Cat extends Animal{
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;
    public static int foodBowl = 0;
    private boolean fullness;

    public Cat(String name) {
        super(name);
        this.fullness = false;
    }
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int amount) {
        if (amount <= foodBowl) {
            foodBowl -= amount;
            fullness = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не хватает еды в миске.");
        }
    }

    public boolean isFullness() {
        return fullness;
    }



}

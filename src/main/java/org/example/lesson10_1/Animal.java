package org.example.lesson10_1;

public abstract class Animal {
    private static int totalAnimals = 0;
    protected String name;
    protected boolean isFull;

    public Animal(String name) {
        this.name = name;
        this.isFull = false;
        totalAnimals++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            this.isFull = true;
            System.out.println(this.name + " поел и теперь сыт.");
        } else {
            System.out.println(this.name + " не хватает еды в миске.");
        }
    }

    public boolean isFullness() {
        return this.isFull;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
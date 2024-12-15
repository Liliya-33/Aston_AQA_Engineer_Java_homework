package org.example.lesson10_1;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public int getFoodAmount() {
        return this.foodAmount;
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
    }

    public void addFood(int amount) {
        this.foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + this.foodAmount + " еды.");
    }
}
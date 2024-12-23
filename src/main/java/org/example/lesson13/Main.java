package org.example.lesson13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"яблоко", "банан", "вишня", "абрикос", "яблоко", "малина", "мандарин", "виноград", "яблоко", "банан"};

        // Подсчет частоты слов
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Вывод уникальных слов и их частоты
        System.out.println("Уникальные слова и их частоты:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Олег", "123-456-7890", "987-654-3210");
        phoneBook.addEntry("Родион", "555-555-5555");
        phoneBook.addEntry("Иван", "111-222-3333", "444-555-6666", "777-888-9999");

        System.out.println("\nТелефонный справочник:");
        System.out.println("Олег: " + String.join(", ", phoneBook.getPhones("Олег")));
        System.out.println("Родион: " + String.join(", ", phoneBook.getPhones("Родион")));
        System.out.println("Иван: " + String.join(", ", phoneBook.getPhones("Иван")));

    }

}

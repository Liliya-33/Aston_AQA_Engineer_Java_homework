package org.example.lesson13;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
        private final Map<String, String[]> phoneBook;

        public PhoneBook() {
            phoneBook = new HashMap<>();
        }

        public void addEntry(String name, String... phones) {
            phoneBook.put(name, phones);
        }

        public String[] getPhones(String name) {
            return phoneBook.get(name);
        }
    }


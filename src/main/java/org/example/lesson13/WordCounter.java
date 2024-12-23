package org.example.lesson13;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
        private final String[] words;

        public WordCounter(String[] words) {
            this.words = words;
        }

        public Map<String, Integer> countWordFrequency() {
            Map<String, Integer> wordFrequency = new HashMap<>();

            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            return wordFrequency;
        }
}

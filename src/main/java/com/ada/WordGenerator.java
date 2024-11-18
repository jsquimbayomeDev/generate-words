package com.ada;


import java.util.*;

public class WordGenerator {

    private final Set<String> dictionary;
    private final char[] availableChars = {
            'w', 'e', 'r', 'f', 'b', 'h', 'j', 'l', 'u', 'y', 't', 'r', 'e', 'd', 'f', 'g',
            'u', 't', 'r', 'e', 's', 'd', 'f', 'g', 'y', 'u', 'i', 'o', 'l', 'k', 'm', 'n',
            'b', 'v', 'f', 'r', 'e', 'w', 's', 'x', 'f', 'g', 'y', 'u', 'i', 'k', 'm', 'n',
            'b', 'v', 'f', 'r', 'e', 'w', 'w', 'r', 't', 'y', 'u', 'i', 'o', 'k', 'm', 'n',
            'b', 'v', 'd', 'w', 's', 'x', 'c', 'f', 'g', 'h', 'u', 'i', 'o', 'p', 'l', 'k',
            'n', 'b', 'v', 'f', 'd', 'e', 'w', 'a', 'z', 'x', 'c', 'g', 'h', 'u', 'i', 'o',
            'p', 'u', 'y', 't', 'r', 'e', 'w', 'q', 's', 'd', 'f', 'g', 'k', 'j', 'b', 'v',
            'c', 'x'
    };

    public WordGenerator(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> generateWords(int numberOfWords, int wordLength) {
        List<String> generatedWords = new ArrayList<>();
        Random random = new Random();

        while (generatedWords.size() < numberOfWords) {
            StringBuilder word = new StringBuilder();

            for (int i = 0; i < wordLength; i++) {
                word.append(availableChars[random.nextInt(availableChars.length)]);
            }

            String generatedWord = word.toString().toLowerCase();

            if (dictionary.contains(generatedWord)) {
                generatedWords.add(generatedWord);
            }
        }

        return generatedWords;
    }
}


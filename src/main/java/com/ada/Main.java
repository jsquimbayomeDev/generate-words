package com.ada;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        DictionaryLoader loader = new DictionaryLoader();
        Set<String> dictionary = loader.loadDictionary();


        WordGenerator generator = new WordGenerator(dictionary);
        int numberOfWords = 5;
        int wordLength = 5;

        List<String> words = generator.generateWords(numberOfWords, wordLength);


        System.out.println("words generated: ");
        words.forEach(System.out::println);
    }
}
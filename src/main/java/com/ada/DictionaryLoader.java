package com.ada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DictionaryLoader {

    private static final String DICTIONARY_FILE = "/dictionary.txt";

    public Set<String> loadDictionary() {
        Set<String> dictionary = new HashSet<>();

        try (InputStream inputStream = getClass().getResourceAsStream(DICTIONARY_FILE);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = reader.readLine()) != null) {
                dictionary.add(line.toLowerCase());
            }
        } catch (IOException e) {
            throw new RuntimeException("Error to load dictionary", e);
        }

        return dictionary;
    }
}


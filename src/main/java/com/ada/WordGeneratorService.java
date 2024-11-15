package com.ada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGeneratorService {
    private final char[] caracteres;
    private final SpanishWordValidatorApi validator;
    private final Random random;

    public WordGeneratorService(char[] caracteres, SpanishWordValidatorApi validator) {
        this.caracteres = caracteres;
        this.validator = validator;
        this.random = new Random();
    }

    // Genera una palabra válida en español de longitud especificada
    public String generateValidWord(int length) {
        String word;
        do {
            word = generateWord(length);
        } while (!validator.isValidWord(word));
        return word;
    }

    // Genera múltiples palabras válidas en español
    public List<String> generateMultipleValidWords(int count, int length) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            words.add(generateValidWord(length));
        }
        return words;
    }


    private String generateWord(int length) {
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            word.append(caracteres[random.nextInt(caracteres.length)]);
        }
        return word.toString();
    }
}

package com.ada;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        char[] caracteres = {
                'w', 'e', 'r', 'f', 'b', 'h', 'j', 'i', 'u', 'y', 't', 'r', 'e', 'd', 'f', 'g', 'u', 't', 'r', 'e', 's', 'd',
                'f', 'g', 'y', 'u', 'i', 'o', 'l', 'k', 'm', 'n', 'b', 'v', 'f', 'r', 'e', 'w', 's', 'x', 'f', 'g', 'y', 'u',
                'i', 'k', 'm', 'n', 'b', 'v', 'f', 'r', 'e', 'w', 'w', 'r', 't', 'y', 'u', 'i', 'o', 'k', 'm', 'n', 'b', 'v',
                'd', 'w', 's', 'x', 'c', 'f', 'g', 'h', 'u', 'i', 'o', 'p', 'l', 'k', 'n', 'b', 'v', 'f', 'd', 'e', 'w', 'a',
                'z', 'x', 'c', 'g', 'h', 'u', 'i', 'o', 'p', 'u', 'y', 't', 'r', 'e', 'w', 'q', 's', 'd', 'f', 'g', 'k', 'j',
                'b', 'v', 'c', 'x'
        };

        SpanishWordValidatorApi validator = new SpanishWordValidatorApi();
        WordGeneratorService wordService = new WordGeneratorService(caracteres, validator);

        // Generar una palabra válida de 5 caracteres
        String palabra = wordService.generateValidWord(5);
        System.out.println("Palabra válida generada: " + palabra);

        // Generar 3 palabras válidas de 6 caracteres
        List<String> palabras = wordService.generateMultipleValidWords(3, 6);
        System.out.println("Lista de palabras válidas generadas: " + palabras);
    }
}
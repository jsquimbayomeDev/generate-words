package com.ada;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.IOException;

public class SpanishWordValidatorApi {
    private static final String API_URL = "https://api.dictionaryapi.dev/api/v2/entries/es/";

    // Valida si una palabra es válida en español usando la API
    public boolean isValidWord(String word) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(API_URL + word);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                return response.getCode() == 200; // 200 indica que la palabra es válida
            }
        } catch (IOException e) {
            System.out.println("error to validate the word: " + e.getMessage());
        }
        return false;
    }
}

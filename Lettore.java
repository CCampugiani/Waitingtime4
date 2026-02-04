package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lettore {
    public static Canzone leggiDaFile() {
        try (BufferedReader reader = new BufferedReader(new
                FileReader("canzone.json"))) {
            Gson gson = new Gson();

            Canzone canzone = gson.fromJson(reader, Canzone.class);
            return canzone;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

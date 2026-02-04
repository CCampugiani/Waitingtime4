package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
public class Scrittore{
    public static void salvaSuFile(Canzone canzone) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(canzone);
        try (BufferedWriter writer = new BufferedWriter(new
                FileWriter("canzone.json"))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
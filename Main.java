package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Inserisci e salva canzone");
            System.out.println("2 - Leggi canzone da file");
            System.out.println("0 - Esci");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer

            switch (scelta) {

                case 1:
                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Durata (secondi): ");
                    int durata = scanner.nextInt();
                    Canzone c = new Canzone(titolo, durata);
                    Scrittore.salvaSuFile(c);
                    System.out.println("canzone salvata");
                    break;

                case 2:
                    Canzone letta = Lettore.leggiDaFile();

                    if (letta != null) {
                        System.out.println("\ncanzone letta dal file:");
                        System.out.println("titolo: " + letta.getTitolo());
                        System.out.println("durata: " + letta.getDurata());
                    } else {
                        System.out.println("errore nella lettura del file.");
                    }
                    break;

                case 0:
                    System.out.println("fine");
                    break;
            }

        } while (scelta != 0);

        scanner.close();
    }
}

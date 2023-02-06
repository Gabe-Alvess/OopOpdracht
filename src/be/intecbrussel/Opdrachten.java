package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class Opdrachten {
    public static void main(String[] args) {
        System.out.println("---- Opdracht 1 - Random integers ----");
        // - Maak een Random generator en vraag verschillende integers op.
        // - Zorg ervoor dat je alleen maar getallen kunt genereren tussen 0 en 99.
        // - Maak nu een applicatie die maar 6 getallen opvraagt.

        Random random = new Random();
        int maxRandomNum = 0;

        while (maxRandomNum < 6) {
            int randomNumber = random.nextInt(100);
            maxRandomNum++;
            System.out.println("Random number: " + randomNumber);
        }

        System.out.println("---- Opdracht 3 ----");
        // - Maak een nieuwe Scanner die een String opvraagt.
        // - Maak nu een programma dat het volgende doet:
        // - druk de tekst af in grote letters.
        // - druk de tekst af in kleine letters
        // - Vervang alle ‘e’ door ‘u’
        // - Druk af hoeveel keer de letter ‘r’ in je String voorkomt.(een beetje moeilijk, wees creatief ;) )
        // - Maak twee strings en vergelijk ze met elkaar met een String methode.
        // - Vergelijk twee Strings alfabetisch, en druk ze allebei af. De String die eerst alfabetisch komt, moet eerst afgedrukt worden.
        // - Maak een string met extra spaties vooraan en achteraan. Druk de string dan af zonder de spaties.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Schrijf een word!");
        String answer1 = scanner.nextLine().toLowerCase();

        String upperCase = answer1.toUpperCase();
        String lowerCase = answer1.toLowerCase();
        String replacedLetters = answer1.replaceAll("e", "u");

        System.out.println("Schrijf nog een word!");
        String answer2 = scanner.nextLine().toLowerCase();

        boolean comparison = answer1.equals(answer2);


        System.out.println("Results: ");
        System.out.println("Hoofdletters = " + upperCase);
        System.out.println("Kleine letters = " + lowerCase);

        for (int i = 0;i < 1; i++) {
            if (answer1.contains("e")) {
                System.out.println("Alle letters (e) vervangt door (u) = " + replacedLetters);
            } else {
                System.out.println("Geen letters (e) gevonden in het word " + answer1);
            }
        }

        if (comparison) {
            System.out.println("Het word " + answer1 + " is gelijk aan het word " + answer2);
        } else {
            System.out.println("Het word " +  answer1 + " is niet gelijk aan aan het word " + answer2);
        }

        int count = 0;
        for (int i = 0; i < answer1.length(); i++ ) {
            if (answer1.charAt(i) == 'r') {
               count++;
            }
        }

        if (answer1.contains("r")) {
            System.out.println("De letter r is " + count + " keer voor gekomen bij het word " + answer1.toLowerCase() + ".");
        } else {
            System.out.println("Geen letters (r) gevonden in het word " + answer1);
        }

        int firstCodePoint = answer1.codePointAt(0);
        int secondCodePoint = answer2.codePointAt(0);

        if (firstCodePoint < secondCodePoint) {
            System.out.println("Strings op alfabetisch volgorde: ");
            System.out.println(answer1 + ", " + answer2 + "...");
        } else {
            System.out.println("Strings op alfabetisch volgorde: ");
            System.out.println(answer2 + ", " + answer1 + "...");
        }

        System.out.println("String zonder spaties vooraan en achteraan: ");
        String str3 = "      Hello, my name is Gabriel     ";
        System.out.println(str3.strip());

        System.out.println("---- Opdracht 4 ----");

        System.out.println("Schrijf een naam!");
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        System.out.println("Schrijf een familienaam!");
        StringBuilder str2 = new StringBuilder(scanner.nextLine());
        System.out.println("Naam: " + str1);
        System.out.println("Familienaam: " + str2);

    }
}

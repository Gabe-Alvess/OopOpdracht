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

        // Opdracht 2
        // Zelfstudie

        System.out.println("---- Opdracht 3 ----");
        // - Maak een nieuwe Scanner die een String opvraagt.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schrijf een word!");
        String answer1 = scanner.nextLine().toLowerCase();

        // - druk de tekst af in grote letters
        String upperCase = answer1.toUpperCase();
        System.out.println("Grote letters: " + upperCase);

        // - druk de tekst af in kleine letters
        String lowerCase = answer1.toLowerCase();
        System.out.println("Kleine letters: " + lowerCase);

        // - Vervang alle ‘e’ door ‘u’
        String replacedLetters = answer1.replaceAll("e", "u");
        if (answer1.contains("e")) {
            System.out.println("Alle letters 'e' vervangen door 'u' = " + replacedLetters);
        } else {
            System.out.println("Geen letters (e) gevonden in het word " + answer1);
        }

        // - Druk af hoeveel keer de letter ‘r’ in je String voorkomt
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

        // - Maak twee strings en vergelijk ze met elkaar met een String methode.
        String string1 = "Tekst";
        String string2 = "tekst";

        boolean comparison = string1.equalsIgnoreCase(string2);

        if (comparison) {
            System.out.println("Het word " + string1 + " is gelijk aan het word " + string2);
        } else {
            System.out.println("Het word " +  string1 + " is niet gelijk aan aan het word " + string2);
        }

        // - Vergelijk twee Strings alfabetisch, en druk ze allebei af. De String die eerst alfabetisch komt, moet eerst afgedrukt worden.
        String string3 = "zebra";
        String string4 = "aap";
        int firstCodePoint = string3.codePointAt(0);
        int secondCodePoint = string4.codePointAt(0);

        if (firstCodePoint < secondCodePoint) {
            System.out.println("Strings op alfabetisch volgorde -> 1ste manier ");
            System.out.println(string3 + "\n" + string4);
        } else {
            System.out.println("Strings op alfabetisch volgorde -> 1ste manier ");
            System.out.println(string4 + "\n" + string3);
        }

        // Of
        int compareResult = string3.compareToIgnoreCase(string4);
        if (compareResult < 0) {
            System.out.println("Strings op alfabetisch volgorde -> 2de manier ");
            System.out.println(string3 + "\n" + string4);
        } else {
            System.out.println("Strings op alfabetisch volgorde -> 2de manier ");
            System.out.println(string4 + "\n" + string3);
        }

        // - Maak een string met extra spaties vooraan en achteraan. Druk de string dan af zonder de spaties.
        String string5 = "      Hello, my name is Gabriel     ";
        System.out.println("String met spaties: " + "\n" + string5);
        System.out.println("String zonder spaties: " + "\n" + string5.strip() + " 'met strip()'");
        System.out.println("String zonder spaties: " + "\n" + string5.trim() + " 'met trim()'");

        System.out.println("---- Opdracht 4 ----");

        // - Maak een programma dat twee Strings opvraagt met StringBuilder
        System.out.println("Schrijf eerste string");
        String input1 = scanner.nextLine();
        System.out.println("Schrijf tweede string");
        String input2 = scanner.nextLine();

        StringBuilder sb1 = new StringBuilder(input1);
        StringBuilder sb2 = new StringBuilder(input2);
        // - Voeg extra tekst toe aan de eerste StringBuilder
        sb1.append(" -> extra text");
        System.out.println("1ste StringBuilder met extra tekst: " + sb1);
        // - Draai de tekst van de 2de StringBuilder om
        sb2.reverse();
        System.out.println("Tekst van 2de StringBuilder omgedraaid: " + sb2);

        // - Verwijder alle spaties van de eerste StringBuilder
        int i = 0;
        while (i < sb1.length()) {
            if (sb1.charAt(i) == ' ') {
                sb1.deleteCharAt(i);
            } else {
                i++;
            }
        }
        System.out.println("1ste StringBuilder zonder spaties -> " + sb1);

        // - Verdubbel iedere letter 't' in de tweede StringBuilder
        while (i < sb2.length()) {
            if (sb2.charAt(i) == 't') {
                sb2.insert(i + 1, 't');
                i += 2;
            } else {
                i++;
            }
        }
        System.out.println("2de StringBuilder met verdubbelde 't': " + sb2);

        // - Verwijder bij de tweede StringBuilder 2 worden
        int firstSpace = sb2.indexOf(" ");
        System.out.println("Index of first space = " + firstSpace);
        int secondSpace = sb2.indexOf(" ", firstSpace + 1);
        System.out.println("Index of second space = " + secondSpace);
        sb2.delete(0, secondSpace + 1);
        System.out.println("2de StringBuilder zonder 2 woorden: " + sb2);
    }
}

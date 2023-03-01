//package dsaa.lab01;

import java.util.Scanner;

public class Document {
    public static void loadDocument(String name, Scanner scan) {
        String line = scan.nextLine();
        while (!line.equals("eod")) {
            if (correctLink(line)) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (correctLink(word))
                    {
                        String[] parts = word.split("=");
                        System.out.println(parts[1]);
                    }
                }
            }
            line = scan.nextLine();
        }
    }

    public static boolean correctLink(String link) {
        if (!link.startsWith("link=")) {
            return false;
        }
        String[] parts = link.split("=");
        if (parts.length != 2) {
            return false;
        }
        char[] linkChars = parts[1].toCharArray();
        if (Character.isLetter(linkChars[0])) {
            for (int i = 1; i < linkChars.length; i++) {
                if (!Character.isLetterOrDigit(linkChars[i]) && linkChars[i] != '_') {
                    return false;
                }
            }
        }
        return true;
    }

}
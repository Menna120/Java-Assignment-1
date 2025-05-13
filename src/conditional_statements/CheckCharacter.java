package conditional_statements;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = scanner.next().toLowerCase();

        scanner.close();

        switch (ch) {
            case "a", "e", "i", "o", "u" -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }

    }
}

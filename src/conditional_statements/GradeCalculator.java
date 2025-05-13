package conditional_statements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade (A/B/C/F): ");
        String grade = scanner.next().toUpperCase();
        scanner.close();

        switch (grade) {
            case "A" -> System.out.println("Marks range: 80 and above");
            case "B" -> System.out.println("Marks range: 60 to 79");
            case "C" -> System.out.println("Marks range: 40 to 59");
            case "F" -> System.out.println("Marks range: Below 40");
            default -> System.out.println("Invalid grade");
        }
    }
}
package conditional_statements;

import java.util.Scanner;

public class SeasonPrint {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int monthNumber = scanner.nextInt();

        scanner.close();

        System.out.println(switch (monthNumber) {
                    case 3, 4, 5 -> "Spring";
                    case 6, 7, 8 -> "Summer";
                    case 9, 10, 11 -> "Fall";
                    case 12, 1, 2 -> "Winter";
                    default -> "Invalid month number.";
                }
        );
    }
}

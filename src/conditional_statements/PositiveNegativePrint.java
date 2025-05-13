package conditional_statements;

import java.util.Scanner;

public class PositiveNegativePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;
        System.out.print("Enter a number: ");
        num = scanner.nextFloat();
        scanner.close();

        if (num > 0) System.out.println(num + " is positive.");
        else if (num < 0) System.out.println(num + " is negative.");
        else System.out.println(num + " is zero.");
    }
}

package conditional_statements;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers (separated by ', '): ");
        Float[] numbers = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Float::parseFloat)
                .toArray(Float[]::new);

        scanner.close();

        float a = numbers[0], b = numbers[1], c = numbers[2];
        float max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        float min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

        System.out.println("Max = " + max + ", Min = " + min);
    }
}
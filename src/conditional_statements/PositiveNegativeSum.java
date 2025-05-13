package conditional_statements;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (separated by ', '): ");
        Float[] numbs = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Float::parseFloat)
                .toArray(Float[]::new);

        scanner.close();

        float positiveSum = 0, negativeSum = 0;

        for (Float num : numbs) {
            if (num > 0) positiveSum += num;
            else negativeSum += num;
        }

        System.out.println("Positive Sum = " + positiveSum + "\n" + "Negative Sum = " + negativeSum);
    }
}

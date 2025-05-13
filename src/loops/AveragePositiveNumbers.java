package loops;

import java.util.Scanner;

public class AveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter the positive number to exit enter negative number: ");
            double num = scanner.nextDouble();

            if (num < 0) break;

            sum += num;
            count++;
        }

        System.out.print("Average of positive numbers is: " + sum / count);

        scanner.close();
    }
}

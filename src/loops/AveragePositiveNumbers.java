package loops;

import java.util.Scanner;

public class AveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        System.out.println("Enter the positive numbers to calculate the average.");
        while (true) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();

            if (num < 0) break;

            sum += num;
            count++;
        }

        System.out.print("Average of positive numbers is: " + sum / count);

        scanner.close();
    }
}

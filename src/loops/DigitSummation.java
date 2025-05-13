package loops;

import java.util.Scanner;

public class DigitSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number: ");

        int num = scanner.nextInt();

        scanner.close();

        int digit_sum = 0;

        while (num != 0) {
            digit_sum += num % 10;
            num /= 10;
        }

        System.out.println(digit_sum);
    }
}

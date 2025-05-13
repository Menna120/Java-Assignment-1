package loops;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num = scanner.nextInt();

        scanner.close();

        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("The number has " + count + " digits.");

    }
}

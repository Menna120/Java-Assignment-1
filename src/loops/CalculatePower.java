package loops;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        scanner.close();

        double result = Math.pow(base, power);

        System.out.println(base + " ^ " + power + " = " + (long) result);

    }
}
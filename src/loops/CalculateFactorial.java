package loops;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer number: ");
        int num = scanner.nextInt();
        long factorial = 1;

        scanner.close();

        for (; num > 1; num--) {
            factorial *= num;
        }

        System.out.println("The factorial is: " + factorial);
    }
}
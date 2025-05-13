package conditional_statements;

import java.util.Scanner;

public class MaxNumberPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter 1st numbers: ");
        num1 = scanner.nextInt();
        System.out.print("Enter 2nd numbers: ");
        num2 = scanner.nextInt();
        System.out.print("Enter 3rd numbers: ");
        num3 = scanner.nextInt();

        scanner.close();

        System.out.println("The greatest number is: " + (num1 > num2 && num1 > num3 ? num1 : (num2 > num3 ? num2 : num3)));
    }
}

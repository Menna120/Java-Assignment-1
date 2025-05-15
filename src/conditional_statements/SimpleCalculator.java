package conditional_statements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1, num2;
        String operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        num2 = scanner.nextFloat();
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next();

        scanner.close();

        if (num2 == 0 && operator.equals("/")) {
            System.out.println("Cannot divide by zero.");
            return;
        }

        System.out.println(
                num1 + " " + operator + " " + num2 + " = " +
                        switch (operator) {
                            case "+" -> num1 + num2;
                            case "-" -> num1 - num2;
                            case "*" -> num1 * num2;
                            case "/" -> num1 / num2;
                            default -> "Invalid operator";
                        }
        );
    }
}

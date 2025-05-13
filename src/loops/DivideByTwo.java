package loops;

import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        scanner.close();

        while (true) {
            num = num / 2;
            if (num < 1) break;
            count++;
        }

        System.out.println("The number can be divided by 2 " + count + " times before it becomes less than 1.");
    }
}
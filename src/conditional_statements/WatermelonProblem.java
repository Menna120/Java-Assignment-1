package conditional_statements;

import java.util.Scanner;

public class WatermelonProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight;
        System.out.print("Enter the Weight of watermelon: ");
        weight = scanner.nextInt();
        scanner.close();

        System.out.println(weight % 2 == 0 ? "YES" : "NO");
    }
}

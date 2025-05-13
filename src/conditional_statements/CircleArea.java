package conditional_statements;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        float radius = scanner.nextFloat();
        scanner.close();

        System.out.println("Area = " + Math.PI * Math.pow(radius, 2));
    }
}

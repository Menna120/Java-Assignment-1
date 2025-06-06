package loops;

public class OddProduct {
    public static void main(String[] args) {
        long product = 1;

        System.out.println("Calculating the product of odd integers from 1 to 15...");

        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }
}

package loops;

public class SevenMultiplication {
    public static void main(String[] args) {
        System.out.println("The sequence of multiples of 7 from 7 to 98:");

        for (int i = 1; i <= 14; i++) {
            System.out.print(7 * i);

            if (i < 14) {
                System.out.print(", ");
            }
        }
    }
}
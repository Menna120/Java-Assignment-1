package loops;

public class PowersOfTwo {
    public static void main(String[] args) {
        System.out.println("The sequence of powers of 2 from 1 to 512:");

        for (int i = 0; i <= 9; i++) {
            System.out.print((long) Math.pow(2, i));

            if (i < 9) {
                System.out.print(", ");
            }
        }
    }
}

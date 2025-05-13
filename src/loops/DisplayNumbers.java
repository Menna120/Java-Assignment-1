package loops;

public class DisplayNumbers {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Numbers from 100 to 200 divisible by 5 or 6, but not both:");

        for (int i = 100; i <= 200; i++) {

            boolean divisibleBy5 = (i % 5 == 0);
            boolean divisibleBy6 = (i % 6 == 0);

            if (divisibleBy5 ^ divisibleBy6) {

                count++;

                System.out.print(i);

                if (count % 10 != 1) System.out.print("\t");
                else System.out.println();
            }
        }
    }
}
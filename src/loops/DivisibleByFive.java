package loops;

public class DivisibleByFive {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 99 divisible by 5:");
        for (int i = 1; i <= 99; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
package loops;

public class PrintNumbersDescending {
    public static void main(String[] args) {
        System.out.println("Numbers from 100 down to 1 in descending order:");

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "\t");
        }
    }
}

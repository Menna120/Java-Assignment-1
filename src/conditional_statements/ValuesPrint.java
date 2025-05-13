package conditional_statements;

public class ValuesPrint {
    public static void main(String[] args) {
        int x = 3, y = 2, z = x++, w = ++y;
        System.out.printf("x = %d\ny = %d\nz = %d\nw = %d\n", x, y, z, w);
    }
}

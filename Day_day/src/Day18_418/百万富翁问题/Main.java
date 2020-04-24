package Day18_418.百万富翁问题;

public class Main {
    public static void main(String[] args) {
        int r = 0;
        int p = 1;
        int sum = 1;
        for (int i = 0; i < 30; i++) {
            r += 10;
        }
        for (int i = 1; i < 30; i++) {
            p = p * 2;
            sum += p;
        }
        System.out.print(r  + " " + sum );
    }
}

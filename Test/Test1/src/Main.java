public class Main {
    public static void main(String[] args) {
        String str = "ABCDEFGHI";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}


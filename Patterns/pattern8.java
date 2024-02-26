public class pattern8 {
    public static void main(String[] args) {
        p(5);
    }

    public static void p(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (i - 1)) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

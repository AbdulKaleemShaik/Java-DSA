public class pattern21 {
    public static void p(int n) {
        int k = n - 2;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        p(4);
        p2(4);
    }

    public static void p2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

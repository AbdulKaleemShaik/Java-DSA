public class pattern11 {
    public static void p(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1)
                    System.out.print(j % 2 + " ");
                else {
                    System.out.print((j - 1) % 2 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p(5);
        pattern118(5);
    }

    static void pattern118(int N) {

        int start = 1;

        for (int i = 0; i < N; i++) {

            if (i % 2 == 1)
                start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

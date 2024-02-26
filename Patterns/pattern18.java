public class pattern18 {
    public static void p(int n) {
        int e = 69;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) e++);
            }
            e = e - i - 1;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        p(5);
    }

}

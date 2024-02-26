public class pattern17 {
    public static void p(int n) {

        int a = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) a++);
            }
            a--;
            for (int j = 1; j < i; j++) {
                System.out.print((char) --a);
            }
            a = 65;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p(4);
    }

}

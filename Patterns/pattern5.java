public class pattern5 {
    public static void p(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p(5);
    }
}

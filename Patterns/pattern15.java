public class pattern15 {
    public static void p(int n) {
        int i = 65;
        for (int j = n; j > 0; j--) {
            for (int j2 = 0; j2 < j; j2++) {
                System.out.print((char) i++);
            }
            i = 65;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        p(5);
    }
}

public class prime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n + 1];
        isprime(n, arr);
    }

    static void isprime(int n, boolean[] br) {
        if (n == 1) {
            System.out.println("1 is neither prime nor composite");
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (!br[i]) {
                    for (int j = i * 2; j <= n; j += i) {
                        br[j] = true;
                    }
                }
            }
            for (int i = 2; i < br.length; i++) {
                if (!br[i]) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}

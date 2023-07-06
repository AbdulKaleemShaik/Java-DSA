import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 20;
        facors(n);
    }

    static void facors(int n) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                ar.add(n / i);
            }

        }
        for (int i = ar.size()-1; i >=0; i--) {
                        System.out.print(ar.get(i)+" ");
            
        }
    }
}

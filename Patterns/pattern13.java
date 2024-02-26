public class pattern13 {
    public static void main(String[] args) {
        p(5);
    }
    public static void p(int n){
        int i=1;
        for (int j = 0; j <= n; j++) {
            for (int j2 = 0; j2 < j; j2++) {
                System.out.print(i++);
            }
            System.out.println();
            
        }
    }
}

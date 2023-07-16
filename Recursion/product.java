public class product {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
    static int product(int n){
        if(n/10==n){
            return 1;
        }
        return n%10 * product(n/10);
    }
}

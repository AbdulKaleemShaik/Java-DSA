public class sum {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    static int sum(int n){
        if(n/10==n){
            return n;
        }
        return n%10+sum(n/10);
    }
}

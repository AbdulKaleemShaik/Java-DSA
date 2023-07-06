public class EVEN {
    public static void main(String[] args) {
        System.out.println(even(46));
    }
    static boolean even(int n){
        return (n & 1) == 0;
    }
}

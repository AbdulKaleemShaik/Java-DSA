public class ArmStrong {
    public static void main(String[] args) {
        int n=153;
        int ans=Armstrong(n);
        if(n==ans){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a armstrong Number");
        }
    }
    static int Armstrong(int n){
        if(n/10==n){
            return n;
        }
        return (n%10)*(n%10)*(n%10) + Armstrong(n/10);
    }
}

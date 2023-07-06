public class LCM {
    public static void main(String[] args) {
        System.out.println(LCM(2, 4));
    }
    static int HCF(int a,int b){
        if(a==0){
            return b;
        }
        return HCF(b%a, a);
    }
    static int LCM(int a, int b){
        return (a*b)/HCF(a, b);
    }
    
}

 class fibinaccoi {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }
}

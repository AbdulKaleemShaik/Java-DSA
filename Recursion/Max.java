public class Max {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 0, 8, 3, 4, 5, 6, 7, 11 };
        Max(arr, arr.length - 1, 0);
        Min(arr,arr.length-1,arr[0]);
    }

    static void Max(int[] arr, int n, int max) {
        if (n < 0) {
            System.out.println(max);
            return;
        }
        if (arr[n] > max) {
            Max(arr, n - 1, arr[n]);
        } else {
            Max(arr, n - 1, max);
        }

    }
    static void Min(int[] arr,int n,int min){
         if(n<1){
            System.out.println(min);
            return;
         }
         if(arr[n]<min){
            Min(arr, n-1, arr[n]);
         }
         else{
            Min(arr, n-1, min);
         }
    }
}

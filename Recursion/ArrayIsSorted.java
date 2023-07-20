import java.util.Arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 9,6,7,8 };
       System.out.println(Sorted(ar, ar.length - 1));
      
    }

    static boolean Sorted(int[] arr, int n) {
        if (n == 0) {
            return true;
        }
        if (arr[n] > arr[n - 1]) {
            return Sorted(arr, n - 1);
        }
        return false;

    }
    

}

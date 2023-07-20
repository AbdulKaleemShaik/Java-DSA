
import java.util.*;

class MaxAndMin {

    public static int findMaxRec(int A[], int n) {

        if (n == 1)
            return A[0];

        return Math.max(A[n - 1], findMaxRec(A, n - 1));
    }
    public static int findMinRec(int A[], int n) {

        if (n == 1)
            return A[0];

        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }
    public static int findMaxRec1(int A[], int n) {

        if (n == 0)
            return A[0];

        return Math.max(A[n ], findMaxRec1(A, n -1));
    }

    public static void main(String args[]) {
        int A[] = { 1, 4, 45, 6, -50, 10, 2 };
        int n = A.length-1;

        System.out.println(findMaxRec1(A, n));
       // System.out.println(findMinRec(A, n));
    }
}

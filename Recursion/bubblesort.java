import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 2, 1 };
        bubble(a, a.length - 1, 0);
        System.out.println(Arrays.toString(a));
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = temp;
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }
}
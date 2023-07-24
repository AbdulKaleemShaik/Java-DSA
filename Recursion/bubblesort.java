import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] a = { 1, 2, 6, 4, 5 };
        bubble(a, a.length - 1, 0);
        System.out.println(Arrays.toString(a));
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

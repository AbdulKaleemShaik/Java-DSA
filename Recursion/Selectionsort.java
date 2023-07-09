import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 2, 1, 0 };
        selection(a, a.length, 0, 0);
        System.out.println(Arrays.toString(a));
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[max] < arr[c]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }

        } else {
            swap(arr, r - 1, max);

            selection(arr, r - 1, 0, 0);
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

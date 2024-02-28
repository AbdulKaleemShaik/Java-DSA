import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 4, 1 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] ar, int s, int l) {
        int temp = ar[s];
        ar[s] = ar[l];
        ar[l] = temp;
    }
}

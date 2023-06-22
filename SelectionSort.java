import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrr = { 5, 4, 3, 2, 1 };
        selectionSort(arrr);
        System.out.println(Arrays.toString(arrr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);

        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

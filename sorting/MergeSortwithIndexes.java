import java.util.Arrays;

class sort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 7 };
        merge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr
     * @param s
     * @param e
     */
    static void merge(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;

        }
        int m = s + (e - s) / 2;
        merge(arr, s, m);
        merge(arr, m, e);
        merging(arr, s, m, e);
    }

    private static void merging(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s, j = m, k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
                k++;
            } else {
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
       // System.out.println(s);
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s + k2] = mix[k2];

        }
    }
}

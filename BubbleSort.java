import java.util.Arrays;

class Bubble {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean isswapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isswapped = true;
                }

            }
            if (!isswapped)
                break;

        }
    }
   
}
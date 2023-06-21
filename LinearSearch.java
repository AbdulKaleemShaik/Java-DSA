public class LinearSearch {
    public static void main(String[] args) {
        int[] ar = { 1, 34, 56, 23, 567, 98 };
        System.out.println(linearSearch(ar, 567));
    }
    static int linearSearch(int[] arr, int target) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target)
                return j;
        }
        return -1;
    }

}

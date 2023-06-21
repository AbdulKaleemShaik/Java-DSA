class Binarysearch {
    public static void main(String[] args) {
        int[] arrr={9,8,7,6,5,3,4,2,1};
       System.out.println( BinarySearch(arrr, 3));

    }
    static int BinarySearch(int[] ar, int target) {
        int start = 0;
        int end = ar.length - 1;
        boolean iaAsc = ar[start] < ar[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ar[mid] == target)
                return mid;
            else {
                if (iaAsc) {
                    if (ar[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    if (ar[mid] > target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
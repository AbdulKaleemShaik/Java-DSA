public class binary {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        System.out.println(binarysearch(array, 0, 0, array.length-1));
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return binarysearch(arr, target, start, mid-1);
        }
       return binarysearch(arr, target, mid+1, end);
    }
}

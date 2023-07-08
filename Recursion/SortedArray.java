public class SortedArray {
    public static void main(String[] args) {
        int[] array={1,2,3,1};
        System.out.println(Sorted(array, 0));
    }
    static boolean Sorted(int[] arr,int start){
        if(start == arr.length-1){
            return true;
        }
        return arr[start]<arr[start+1] && Sorted(arr,start+1);
        

    }
}

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arrr){
        for (int i = 0; i < arrr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arrr[j]<arrr[j-1]){
                    swap(arrr, j, j-1);
                }
                else{
                    break;
                }
                
            }
            
        }
    } 
    
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

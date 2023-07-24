import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] array={5,3,1,6,7};
       array= mergesort(array);
        System.out.println(Arrays.toString(array));

    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int m=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,m));
        int[] right=mergesort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] mix=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
                k++;
            }else{
                mix[k]=right[j];
                j++;
                k++;
            }
        }
         while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
         }
         while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
         }
        return mix;
    }
}

public class RotatedArray {
   public static void main(String[] args) {
    int[] arr={5,6,7,8,9,1,2,3};
    System.out.println(search(arr, 0, arr.length-1, 1));
   } 
   static int search(int[] arr,int s,int e,int target){
      if(s>e){
         return -1;
      }
      int m=s+(e-s)/2;
      if(arr[m]==target){
         return m;
      }
      if(arr[s]<=arr[m]){
         if(target>= arr[s] && target <= arr[m]){
            return search(arr, s, m-1, target);
         }
         else{
            return search(arr, m+1, e, target);
         }
      }
      if(target<=arr[e] && target>= arr[m]){
         return search(arr, m+1, e, target);
      }
      return search(arr, s, m-1, target);
   }
}

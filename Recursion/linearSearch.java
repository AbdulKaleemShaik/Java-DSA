public class linearSearch {
    public static void main(String[] args) {
        int[] array={2,3,5,1,3,5,7};
        System.out.println(Linear(array, 0, 7));
    }
    static int Linear(int[] arr,int index,int target){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return Linear(arr,index+1,target);
    }
}

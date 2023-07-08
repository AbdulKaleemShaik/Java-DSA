import java.util.ArrayList;

public class Allindex {
    public static void main(String[] args) {
 int[] arr={1,1,1,1,4,5};
 System.out.println(all(arr, 1, 0,new ArrayList<>()));
    }

    static ArrayList<Integer> all(int[] array, int target, int index, ArrayList<Integer> list) {
        if(index == array.length){
            return list;
        }
        if(array[index]==target){
            list.add(index);
        }
        return all(array, target, index+1, list);
    }
}

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
    }
    static void SumTriangle(int[] A){
        if(A.length==0){
            return;
        }

        int n=A.length-1;
        int[] temp=new int[n];
        for (int i = 0; i < temp.length; i++) {
                temp[i]=A[i]+A[i+1];            
        }
        SumTriangle(temp);
        System.out.println(Arrays.toString(A));

    }
}

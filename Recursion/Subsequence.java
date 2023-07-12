public class Subsequence {
    public static void main(String[] args) {
             subsequence("abc","");

    }
    static void subsequence(String str,String str2){
        if(str.isEmpty()){
            System.out.println(str2);
            return;
        }
        char s=str.charAt(0);
        subsequence(str.substring(1), str2);
        subsequence(str.substring(1), str2+s);
       }
}

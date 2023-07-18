import java.util.ArrayList;

public class SubsequeneArraylist {
    public static void main(String[] args) {
        String s="ac";
   ArrayList<String> ans=subsequence("abc","");
   for (int i = 0; i < ans.size(); i++) {
    if(s.equals(ans.get(i))){
        System.out.println(true);
    }
   
    
   }
    }
    static ArrayList<String> subsequence(String str, String str2) {
        if (str.isEmpty()) {
            ArrayList<String> ar = new ArrayList<String>();
            ar.add(str2);
            return ar;
        }
        char s = str.charAt(0);
        ArrayList<String> left = subsequence(str.substring(1), str2 + s);
        ArrayList<String> right = subsequence(str.substring(1), str2);
        left.addAll(right);
        return left;
    }
}

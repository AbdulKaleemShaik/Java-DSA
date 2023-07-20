public class length {
    public static void main(String[] args) {
        System.out.println(len("abcdefgh", 0));
    }
    static int len(String p,int count){
        if(p.isEmpty()){
            return count;
        }
        return len(p.substring(1), count+1);
    }
}

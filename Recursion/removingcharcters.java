public class removingcharcters {
    public static void main(String[] args) {
        removecharacters("", "baccdaaaj");
    }
    static void removecharacters(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char s=up.charAt(0);
        if(s=='a'){
            removecharacters(p, up.substring(1));
        }
        else{
            removecharacters(p+s, up.substring(1));
        }
    }
}

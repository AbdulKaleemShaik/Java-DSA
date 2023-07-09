public class triangle {
    public static void main(String[] args) {
        Pattern(4, 0);
    }
    static void Pattern(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            Pattern(r,c+1);
            System.out.print("*");
            
        } 
        else{
             Pattern(r-1,0);
            System.out.println();
           
        }
    }
}

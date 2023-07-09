public class Triangle2 {
    public static void main(String[] args) {
        Pattern(4, 0);
    }

static void Pattern(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            Pattern(r,c+1);
            
            
        } 
        else{
              System.out.println();
             Pattern(r-1,0);
          
           
        }
    }
}

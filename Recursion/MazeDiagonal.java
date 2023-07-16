import java.util.ArrayList;

public class MazeDiagonal {
    public static void main(String[] args) {
       System.out.println( Maze("", 3, 3));
    }
    static ArrayList<String> Maze(String p,int r,int c){
        if(r==1 && c==2){
          ArrayList<String> sr=new ArrayList<>();
          sr.add(p);
            return sr;
        }
        ArrayList<String> srr=new ArrayList<>();
         if(r>1 && c>1){
           srr.addAll( Maze(p+'D', r-1, c-1));
        }
        if(r>1){
            srr.addAll(Maze(p+'V', r-1, c));
        }
       
        if(c>1){
            srr.addAll(Maze(p+'H', r, c-1));
        }
        return srr;
    }
}

public class Maze {
    public static void main(String[] args) {
        Maze("", 3, 3);
    }
    static void Maze(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Maze(p+'D', r-1, c);
        }
        if(c>1){
            Maze(p+'R', r, c-1);
        }
    }
}

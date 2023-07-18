import java.util.Arrays;
 class MazeAll {
  public static void main(String[] args) {
    boolean[][] b = {
        { true, false, false },
        { true, false, false },
        { true, true, true }
    };
    int[][] path = new int[b.length][b[0].length];
    MazeAll("", b, 0, 0, path, 1);
  }

  static void MazeAll(String p, boolean[][] br, int r, int c, int[][] path, int step) {
    if (r == br.length - 1 && c == br[0].length - 1) {
      path[r][c] = step;
      for (int[] is : path) {
        System.out.println(Arrays.toString(is));

      }
      System.out.println(p);
      System.out.println();
      return;
    }
    if (!br[r][c]) {
      return;
    }
    path[r][c] = step;
    br[r][c] = false;
    if (r < br.length - 1) {
      MazeAll(p + 'D', br, r + 1, c, path, step + 1);
    }
    if (c < br[0].length - 1) {
      MazeAll(p + 'R', br, r, c + 1, path, step + 1);
    }
    if(r<br.length - 1 && c<br[0].length - 1){
      MazeAll(p+"DI", br, r+1, c+1, path, step+1);
    }
    if (r > 0) {
      MazeAll(p + 'U', br, r - 1, c, path, step + 1);
    }
    if (c > 0) {
      MazeAll(p + 'L', br, r, c - 1, path, step + 1);
    }
    br[r][c] = true;
    path[r][c] = 0;

  }
}

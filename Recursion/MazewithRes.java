public class MazewithRes {
    public static void main(String[] args) {
        boolean[][] br = {
                { true, true, true },
                { false, true, true },
                { true, true, true }
        };
        maze("", br, 0, 0);
    }

    static void maze(String p, boolean[][] br, int r, int c) {
        if (r == br.length - 1 && c == br[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!br[r][c]) {
            return;
        }
        if (r < br.length - 1) {
            maze(p + 'D', br, r + 1, c);
        }
        if (c < br[0].length - 1) {
            maze(p + 'V', br, r, c + 1);
        }
    }
}

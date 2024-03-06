import java.util.ArrayList;

public class DFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int i, int j) {
            this.src = i;
            this.dest = j;
        }
    }

    public static void creategraph(ArrayList<Edge>[] gp) {
        for (int i = 0; i < gp.length; i++) {
            gp[i] = new ArrayList<>();
        }
        gp[0].add(new Edge(0, 1));
        gp[0].add(new Edge(0, 2));
        gp[1].add(new Edge(1, 2));
        gp[1].add(new Edge(1, 3));
        gp[2].add(new Edge(2, 4));
        gp[3].add(new Edge(3, 4));
        gp[3].add(new Edge(3, 5));
        gp[4].add(new Edge(4, 5));

    }

    public static void dfs(ArrayList<Edge>[] gp, int src, boolean[] br) {
        if (br[src]) {
            return;
        }
        System.out.print(src + " ");
        br[src] = true;
        for (int i = 0; i < gp[src].size(); i++) {
            Edge e = gp[src].get(i);
            dfs(gp, e.dest, br);
        }

    }

    public static void main(String[] args) {
        @SuppressWarnings({ "unchecked" })
        ArrayList<Edge> gr[] = new ArrayList[6];
        creategraph(gr);
        dfs(gr, 0, new boolean[6]);
    }
}

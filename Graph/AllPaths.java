import java.util.ArrayList;

public class AllPaths {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> ed[] = new ArrayList[4];
        createGraph(ed);
        PrintAllPaths(ed, "" + 2, 2, 3, new boolean[4]);

    }

    public static void PrintAllPaths(ArrayList<Edge>[] ed, String path, int src, int dest, boolean[] br) {
        if (src == dest) {
            System.out.println(path);
            return;
        }
        br[src] = true;
        for (int i = 0; i < ed[src].size(); i++) {
            Edge e = ed[src].get(i);
            if (!br[e.dest]) {
                PrintAllPaths(ed, path + "->" + e.dest, e.dest, dest, br);
            }
        }
        br[src] = false;

    }

    public static void createGraph(ArrayList<Edge>[] ed) {
        for (int i = 0; i < ed.length; i++) {
            ed[i] = new ArrayList<>();
        }
        ed[2].add(new Edge(2, 0));
        ed[2].add(new Edge(2, 1));
        ed[0].add(new Edge(0, 1));
        ed[0].add(new Edge(0, 2));
        ed[0].add(new Edge(0, 3));
        ed[1].add(new Edge(1, 3));

    }
}

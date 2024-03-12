import java.util.ArrayList;

public class DetechCycleInDirectedGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

    }

    public static void createGraph(ArrayList<Edge>[] ed) {
        for (int index = 0; index < ed.length; index++) {
            ed[index] = new ArrayList<>();
        }
        ed[0].add(new Edge(0, 1));
        ed[0].add(new Edge(0, 2));
        ed[1].add(new Edge(1, 0));
        ed[1].add(new Edge(1, 2));
        ed[2].add(new Edge(2, 0));
        ed[2].add(new Edge(2, 1));
        ed[2].add(new Edge(2, 3));
    }

    public static boolean iscyclic(ArrayList<Edge>[] ed, int cur, boolean[] br, boolean[] st) {

        br[cur] = true;
        st[cur] = true;

        for (int i = 0; i < ed[cur].size(); i++) {
            Edge e = ed[cur].get(i);
            if (st[e.dest]) {
                return true;
            } else if (!br[e.dest]) {
                if (iscyclic(ed, e.dest, br, st)) {
                    return true;

                }
            }
        }
        st[cur] = false;

        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] ed = new ArrayList[3];
        createGraph(ed);
        System.out.println(iscyclic(ed, 0, new boolean[3], new boolean[3]));
    }
}

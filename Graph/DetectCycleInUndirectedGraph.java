import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {
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

    public static boolean iscyclic(ArrayList<Edge>[] ed, boolean[] vis, int par, int curr) {
        vis[curr] = true;
        for (int i = 0; i < ed[curr].size(); i++) {
            Edge e = ed[curr].get(i);
            if (vis[e.dest] && e.dest != par) {
                return true;
            } else if (!vis[e.dest]) {
                boolean iscycle = iscyclic(ed, vis, curr, e.dest);
                if (iscycle) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] ed = new ArrayList[4];
        createGraph(ed);
        System.out.println(iscyclic(ed, new boolean[4], -1, 0));
    }

}
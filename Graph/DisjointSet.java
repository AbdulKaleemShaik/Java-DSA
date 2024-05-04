
import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    List<Integer> rank = new ArrayList<>();

    public int makeConnected(int n, int[][] edge) {

        for (int i = 0; i < n; i++) {
            parent.add(i);
            size.add(1);
            rank.add(0);
        }
        int cntExtras = 0;
        int m = edge.length;
        for (int i = 0; i < m; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            if (findUPar(u) == findUPar(v)) {
                cntExtras++;
            } else {
                unionByRank(u, v);
            }
        }
        int cntC = 0;
        for (int i = 0; i < n; i++) {
            if (parent.get(i) == i)
                cntC++;
        }
        int ans = cntC - 1;
        if (cntExtras >= ans)
            return ans;
        return -1;
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v)
            return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v)
            return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int r = rank.get(ulp_u);
            rank.set(ulp_u, r + 1);
        }

    }

    public static void main(String[] args) {
        Connected cr = new Connected();
        System.out.println(
                cr.makeConnected(6, new int[][] { { 0, 1 }, { 1, 4 }, { 0, 2 }, { 0, 3 }, { 1, 2 }, { 1, 3 } }));
    }

}

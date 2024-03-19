import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {

    public static void createGraph(ArrayList<pair> gp[], int n) {
        for (int i = 0; i < n; i++) {
            gp[i] = (new ArrayList<>());
        }
        gp[0].add(new pair(1, 4));
        gp[0].add(new pair(2, 4));
        gp[1].add(new pair(0, 4));
        gp[1].add(new pair(2, 2));
        gp[2].add(new pair(0, 4));
        gp[2].add(new pair(1, 2));
        gp[2].add(new pair(3, 3));
        gp[2].add(new pair(4, 1));
        gp[2].add(new pair(5, 6));
        gp[3].add(new pair(2, 3));
        gp[3].add(new pair(5, 2));
        gp[4].add(new pair(2, 1));
        gp[4].add(new pair(5, 3));
        gp[5].add(new pair(2, 6));
        gp[5].add(new pair(3, 2));
        gp[5].add(new pair(4, 3));
    }

    public static void ShortestPath(ArrayList<pair>[] gp, int[] dis) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a, b) -> a.dist - b.dist);
        pq.add(new pair(0, 0));
        while (!pq.isEmpty()) {
            pair p = pq.poll();
            for (int k = 0; k < gp[p.node].size(); k++) {
                pair pt = gp[p.node].get(k);
                if (dis[p.node] + pt.dist < dis[pt.node]) {
                    dis[pt.node] = dis[p.node] + pt.dist;
                    pq.add(new pair(pt.node, dis[p.node] + pt.dist));
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<pair> gp[] = new ArrayList[6];
        createGraph(gp, 6);
        int[] dist = new int[6];
        for (int i = 0; i < dist.length; i++) {
            if (i != 0) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        ShortestPath(gp, dist);
        System.out.println(Arrays.toString(dist));

    }
}

class pair {
    int node, dist;

    pair(int i, int j) {
        this.node = i;
        this.dist = j;
    }
}
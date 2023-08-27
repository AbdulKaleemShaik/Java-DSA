import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int dta) {
        this.data = dta;
        this.left = null;
        this.right = null;
    }

}

public class LevelorderTraversal {
    static int idx = -1;

    public static Node buildTree(int[] rs) {
        idx++;
        if (rs[idx] == -1) {
            return null;
        }
        Node newnode = new Node(rs[idx]);
        newnode.left = buildTree(rs);
        newnode.right = buildTree(rs);
        return newnode;

    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

            }

        }
    }

    public static void main(String[] args) {
        int[] rt = { 9, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node nr = buildTree(rt);
        levelorder(nr);

    }
}

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

public class Preorder {
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

    public static void main(String[] args) {
        int[] rt = { 9, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node nr = buildTree(rt);
        System.out.println(nr.left.left.data);
    }
}
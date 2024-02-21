public class ConstructonOfBinaryTree {
    static Node root;

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.val);
        display(root.right);
    }

    public static void main(String[] args) {
        root = new Node(12);
        insert(root, 5);
        insert(root, 6);
        insert(root, 3);
        insert(root, 9);
        insert(root, 1);
        display(root);
    }
}

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
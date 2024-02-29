public class AVLTreeInsertion {
    static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static int Balance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    private static Node LeftRotate(Node root2) {
        Node p = root2;
        Node c = p.right;
        p.right = c.left;
        c.right = p;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    private static Node RightRotate(Node root2) {
        Node p = root2;
        Node c = root2.left;
        p.left = c.right;
        c.right = p;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.val)
            root.left = insertRec(root.left, key);
        else if (key > root.val)
            root.right = insertRec(root.right, key);

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = Balance(root);

        if (balance > 1 && height(root.left.left) - height(root.left.right) > 0) {
            return RightRotate(root);
        }
        if (balance > 1 && height(root.left.left) - height(root.left.right) < 0) {
            root.left = LeftRotate(root.left);
            return RightRotate(root);
        }
        if (balance < -1 && height(root.right.left) - height(root.right.right) < 0) {
            return LeftRotate(root);
        }
        if (balance < -1 && height(root.right.left) - height(root.right.right) > 0) {
            root.right = RightRotate(root.right);
            return LeftRotate(root);
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        AVLTreeInsertion tree = new AVLTreeInsertion();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        preOrder(root);

    }

}

class Node {
    int val, height;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

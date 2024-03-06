class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}

public class AVLTree {
    Node root;

    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T = x.right;

        x.right = y;
        y.left = T;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T = y.left;

        y.left = x;
        x.right = T;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    public void ins(int val) {
        root = insert(root, val);
    }

    Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key >= node.key)
            node.right = insert(node.right, key);

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && height(root.left.left) - height(root.left.right) > 0)
            return rightRotate(node);

        if (balance < -1 && height(root.right.left) - height(root.right.right) < 0)
            return leftRotate(node);

        if (balance > 1 && height(root.left.left) - height(root.left.right) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && height(root.right.left) - height(root.right.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.ins(10);
        tree.ins(20);
        tree.ins(30);
        tree.ins(40);
        tree.ins(50);
        tree.ins(25);
        System.out.println("Preorder traversal of constructed tree is : ");
        tree.preOrder(tree.root);
    }
}

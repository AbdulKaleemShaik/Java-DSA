public class DeletionInBST {
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

    public static Node Deletion(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val > val) {
            root.left = Deletion(root.left, val);
        } else if (root.val < val) {
            root.right = Deletion(root.right, val);
        } else {
            if (root.val == val) {
                if (root.left == null && root.right == null) {
                    return null;
                }
                if (root.left == null) {
                    return root.right;
                }
                if (root.right == null) {
                    return root.left;
                } else {
                    Node succ = inorder(root);
                    root.val=succ.val;
                    root.right=Deletion(root.right, succ.val);
                }
            }
        }
        return root;
    }

    public static  Node inorder(Node root) {
        Node lef = root.right;
        while (lef.left != null) {
            lef = lef.left;
        }
        return lef;
    }
    public static void display(Node root) {
        if (root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.val+" ");
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
        Deletion(root, 6);
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

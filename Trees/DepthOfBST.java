import java.util.*;
public class DepthOfBST {
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

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr = { 1, 2, 3, 4, 5 };
        root = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);

        }

        for (int i = 0; i < arr.length; i++) {
            Depth(root, arr[i], 0);
        }

    }

    public static void Depth(Node root, int tar, int dep) {
        if (root == null) {
            return;
        }
        if (root.val == tar) {
            System.out.print(dep + " ");
            return;
        }
        if (root.val > tar) {
            Depth(root.left, tar, dep + 1);
        } else {
            Depth(root.right, tar, dep + 1);
        }

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

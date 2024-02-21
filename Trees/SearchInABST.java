public class SearchInABST {
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
    public static  boolean Search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        else if(root.val>val){
            return Search(root.left, val);
        }
        else{
            return Search(root.right, val);
        }
    }
    public static void main(String[] args) {
        root = new Node(12);
        insert(root, 5);
        insert(root, 6);
        insert(root, 3);
        insert(root, 9);
        insert(root, 1);
        System.out.println(Search(root, 1));
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

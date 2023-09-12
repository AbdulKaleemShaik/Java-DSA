import java.util.Scanner;

public class ImplementationOfBinaryTree {
    static Node root;

    public static void rootinsert() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of root node");
        int val = sc.nextInt();
        root = new Node(val);
        System.out.println("Do you want to enter more elements");
        boolean br = sc.nextBoolean();
        if (br) {
            inserting(sc, root);
        }
    }

    public static void inserting(Scanner sc, Node node) {
        System.out.println("Do you want to enter left element of " + node.value);
        boolean br = sc.nextBoolean();
        if (br) {
            System.out.println("enter left elemnt of " + node.value);
            int val = sc.nextInt();
            node.left = new Node(val);
            inserting(sc, node.left);
        }
        System.out.println("Do you want to enter right element of " + node.value);
        boolean br1 = sc.nextBoolean();
        if (br1) {
            System.out.println("enter right elemnt of " + node.value);
            int val = sc.nextInt();
            // int val = sc.nextInt();
            node.right = new Node(val);
            inserting(sc, node.right);
        }

    }

    public static void display(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        rootinsert();
        display(root);
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int val) {
        this.value = val;
    }
}

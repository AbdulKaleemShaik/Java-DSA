import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node() {

    }

    Node(int val) {
        this.val = val;
    }
}

public class sum {
    static Node head;

    public void insert(int index, Node nod) {
        Scanner sc = new Scanner(System.in);
        if (index == 5) {
            return;
        }
        if (head == null) {
            System.out.println(index + " value");
            int n = sc.nextInt();
            Node node = new Node(n);
            node.next = null;
            head = node;
            // display();
            insert(index + 1, node);
        } else {
            System.out.println(index + " value");
            int n = sc.nextInt();
            Node node = new Node(n);
            node.next = null;
            nod.next = node;
            // display();
            insert(index + 1, node);
        }

    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static int sum(int sum) {
        Node temp = head;
        while (temp != null) {
            sum = sum + temp.val;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        sum lr = new sum();

        lr.insert(0, head);
      //  lr.display();
        System.out.println(sum(0));
    }

}
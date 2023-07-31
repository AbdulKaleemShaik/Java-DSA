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

public class Insertingusingrecursion {
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

    public static void reversee(Node curr, Node tempp) {
        if (tempp.next == null) {
            head = tempp;
        }
        if (tempp.next != null) {
            reversee(tempp, tempp.next);
        }

        tempp.next = curr;
        curr.next = null;

    }
     public static void reverseewithhead(Node curr, Node tempp) {
        if (cur.next.next== null) {
            head = tempp;
        }
        if (tempp.next != null) {
            reversee(tempp, tempp.next);
        }

        tempp.next = curr;
        curr.next = null;

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

    public static void main(String[] args) {
        Insertingusingrecursion lr = new Insertingusingrecursion();

        lr.insert(0, head);
        lr.display();
        lr.reversee(head, head.next);
        lr.display();
    }

}
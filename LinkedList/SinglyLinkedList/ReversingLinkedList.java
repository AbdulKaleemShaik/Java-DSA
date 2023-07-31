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

public class ReversingLinkedList {
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
            insert(index + 1, node);
        } else {
            System.out.println(index + " value");
            int n = sc.nextInt();
            Node node = new Node(n);
            node.next = null;
            nod.next = node;
            insert(index + 1, node);
        }

    }

    public void Reverse(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
    }

    public static void reversing(Node temp) {
        temp = head;
        Node f=head;
        int count=0;
        while (temp != null) {
            System.out.println(temp.val);
            ++count;
            temp=temp.next;
        }
        for (int i = 0; i < count; i++) {
            temp.next=f;
            temp=head;
            
            
        }


       // temp.next.next = temp;

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
        ReversingLinkedList lr = new ReversingLinkedList();

        lr.insert(0, head);
         lr.display();
        lr.reversing(head);
        
    }

}
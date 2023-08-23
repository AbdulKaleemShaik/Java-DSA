public class QueueUsingLinkedlist {
    class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
        }
    }

    Node head;
    Node tail;

    public void push(int item) {
        Node newnode = new Node(item);
        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public int remove() {
        if (head == null) {
            return -1;
        }
        if (head == tail) {
            int temp = head.data;
            head = tail = null;
            return temp;
        }
        int ans = head.data;
        head = head.next;
        return ans;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QueueUsingLinkedlist qe = new QueueUsingLinkedlist();
        qe.push(34);
        qe.push(45);
        qe.push(66);
        qe.push(567);

        System.out.println(qe.peek());
        qe.remove();
        System.out.println(qe.peek());

    }
}

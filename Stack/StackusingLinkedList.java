public class StackusingLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
            next = null;
        }
    }

    public boolean isempty() {
        return head == null;
    }

    public void push(int item) {
        Node newnode = new Node(item);
        if (isempty()) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public int pop() {
        if (isempty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isempty()) {
            return -1;
        }
        return head.data;

    }

    public static void main(String[] args) {

        StackusingLinkedList sr = new StackusingLinkedList();
        sr.push(89);
        sr.push(9);
        sr.push(999);
        sr.push(8888);
        sr.push(10);

        System.out.println(sr.peek());
        System.out.println(sr.pop());
        System.out.println("After removing");
        while (!sr.isempty()) {
            System.out.println(sr.peek());
            sr.pop();
        }
    }
}

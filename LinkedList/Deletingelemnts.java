public class Deletingelemnts {
    Node head;
    Node tail;
    int size;

    Deletingelemnts() {
        this.size = 0;
    }

    public int deleteFirst() {
        int val = head.value;
        Node temp = head;
        temp = temp.next;
        head = temp;
        size--;
        return val;
    }

    public int deleteMiddle(int index) {
        if (size <= 1) {
            return deleteFirst();
        }
        if (index == size) {
            return delteLast();
        }
        Node temp = head;
        Node pre = head.next;
        for (int i = 1; i < index; i++) {
            pre = pre.next;
            temp = temp.next;

        }
        int val = pre.value;

        temp.next = pre.next;
        size--;
        return val;

    }

    public int delteLast() {
        if (size <= 1) {
            size--;
            return deleteFirst();
        }
        int val = tail.value;
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;

        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
}
class Node {
    int value;
    Node next;

    Node(int val) {
        this.value = val;

    }

    Node(int val, Node node) {
        this.value = val;
        this.next = node;
    }

    public static void main(String[] args) {
        InseringElements list = new InseringElements();
        list.insertFirst(89);
        list.insertFirst(45);
        list.insertFirst(23);
        list.insertLast(34);
        list.insertLast(67);
        list.insertLast(90);
        list.insertmiddle(95, 3);
        list.display();
    }
}

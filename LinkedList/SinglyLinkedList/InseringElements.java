public class InseringElements {
    Node head;
    Node tail;
    int size;

    InseringElements() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;

        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertmiddle(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
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
        // list.insertLast(34);
        // list.insertLast(67);
        // list.insertLast(90);
        // list.insertmiddle(95, 3);
        list.display();
    }
}

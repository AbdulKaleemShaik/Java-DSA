class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        DoublyLinkedList dr = new DoublyLinkedList();
        dr.InsertLastWitoutTail(1);
        dr.Insertfirst(45);
        dr.Insertfirst(34);
        dr.Insertfirst(90);
        dr.Insertlast(99);
        dr.Insertfirst(9);
        dr.InsertLastWitoutTail(877);
        dr.Insertmiddle(999, 3);
        dr.displayfromhead();
        dr.displayfromtail();
        System.out.println(dr.size);
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    DoublyLinkedList() {
        this.size = 0;
    }

    public void Insertfirst(int val) {
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void Insertmiddle(int val, int index) {
        Node node = new Node(val);
        if (head == null) {
            Insertfirst(val);
            return;
        }
        Node last = head;
        for (int i = 1; i < index; i++) {
            last = last.next;
        }
        node.prev = last;
        ;
        node.next = last.next;
        last.next.prev = node;
        last.next = node;
        size++;
    }

    public void InsertLastWitoutTail(int val) {
        Node node = new Node(val);
        node.next = null;
        if (head == null) {
            Insertfirst(val);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        tail = node;
        size++;
    }

    public void Insertlast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            Insertfirst(val);
            return;
        }
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void displayfromhead() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayfromtail() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.print("START");
        System.out.println();
    }
}
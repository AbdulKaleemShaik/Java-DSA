class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }

    Node head;
    Node tail;
    int size;

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

    public void removefirst() {
        if (head == null) {
            System.out.println("no elemnt in the list");
            return;
        }
        head.next.prev = null;
        head = head.next;
        size--;
    }

    public void removemiddle(int index) {
        if (head == null) {
            System.out.println("cant remove");
            return;
        }
        Node last = head;
        for (int i = 1; i <= index; i++) {
            last = last.next;
        }
        if (last.next == null) {
            last.prev.next = null;
            tail = last.prev;
            size--;
        } else {
            last.prev.next = last.next;
            last.next.prev = last.prev;
            size--;
        }

    }

    public void removeLast() {
        Node temp = head;
        if (head == null) {
            System.out.println("cant remove");
            return;
        }
        while (temp.next != null) {

            temp = temp.next;
        }
        temp.prev.next = null;
        tail = temp;
        size--;
    }
}
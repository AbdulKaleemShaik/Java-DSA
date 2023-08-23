public class circularqueue {
    static int rear = -1, front = -1;
    static int[] arr;

    circularqueue(int n) {
        arr = new int[n];
    }

    public void push(int item) {
        if (isfull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front++;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = item;
    }

    public int remove() {
        if (isempty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed=arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
        return removed;
    }

    public int peek() {
        if (isempty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];

    }

    private boolean isempty() {
        return front == -1 && rear == -1;
    }

    private boolean isfull() {
        return (rear + 1) % arr.length == front;
    }

    public static void main(String[] args) {
        circularqueue qr = new circularqueue(3);
        qr.push(56);
        qr.push(5665);
        qr.push(5666);
        // qr.push(56666);
        // qr.push(566666);
        System.out.println(qr.peek());
        qr.remove();
        System.out.println(qr.peek());
        qr.push(1);
       // qr.push(9);
        System.out.println(arr[rear]);
        System.out.println(arr[front]);


    }
}

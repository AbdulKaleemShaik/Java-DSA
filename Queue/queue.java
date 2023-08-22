public class queue {
   static  int[] arr;
   static  int front = -1, rear = -1;
    private static final int SIZE = 10;

    queue(int size) {
        arr = new int[size];
    }

    queue() {
        this(SIZE);
    }

    public void push(int item) {
        if (isfull()) {
            System.out.println("cant insert queue is full");
        } else {
            if ((front == -1 && rear == -1)) {
                arr[++rear] = item;
                front++;
            } else {
                arr[++rear] = item;
            }
        }

    }

    public void remove() {
        if (isempty()) {
            System.out.println("Queue is empty");
        } else {
            if (front <= rear) {
                System.out.println(arr[front]);
                front++;
            }
        }
    }

    private boolean isempty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    private boolean isfull() {
        if (rear == arr.length - 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        queue qr=new queue();
        qr.push(12);
        qr.push(13);
        qr.push(14);
        qr.push(15);
        qr.push(16);

        qr.remove();
        System.out.println(arr[front]);
    }

}